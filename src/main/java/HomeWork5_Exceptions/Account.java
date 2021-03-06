package HomeWork5_Exceptions;

public class Account {

    String accountName;
    private int countOfMoney;
    int pinCode;
    boolean accountAccess = false;

    public String getAccountName() {
        return accountName;
    }

    public int getCountOfMoney() {
        if (accountAccess) {
            return countOfMoney;
        } else {
            return -1;
        }
    }

    public void putTheMoney(int money) {
        countOfMoney = countOfMoney + money;
    }


    public void getTheMoney(int money) {
        countOfMoney -= money;
    }

    public Account(String accountName, int countOfMoney, int pinCode) {
        this.accountName = accountName;
        this.countOfMoney = countOfMoney;
        this.pinCode = pinCode;
        this.accountAccess = false;
    }
}
