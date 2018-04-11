package hw_11_04_18;

public class Account {
    private int balance;
    private String nameMoney;

    public Account() {
    }

    public Account(int balance, String nameMoney) {
        this.balance = balance;
        this.nameMoney = nameMoney;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getNameMoney() {
        return nameMoney;
    }

    public void setNameMoney(String nameMoney) {
        this.nameMoney = nameMoney;
    }
}
