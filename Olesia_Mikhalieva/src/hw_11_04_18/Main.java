package hw_11_04_18;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(1200,"UAH");

        ATM atm1 = new ATM(account);
        ATM atm2 = new ATM(account);
        ATM atm3 = new ATM(account);
        ATM atm4 = new ATM(account);

        UtilsMoney.newTreadForGetMoney(900, atm1);
        UtilsMoney.newTreadForGetMoney(900, atm2);
        UtilsMoney.newTreadForGetMoney(300, atm3);
        UtilsMoney.newTreadForPutMoney(1000, atm4);

    }
}
