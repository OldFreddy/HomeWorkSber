package HomeWork5_Exceptions;

public class Account {

    String accountName;
    int countOfMoney;
    int pinCode;

    public String getAccountName() {
        return accountName;
    }

    public Account(String accountName, int countOfMoney, int pinCode) {
        this.accountName = accountName;
        this.countOfMoney = countOfMoney;
        this.pinCode = pinCode;
    }
}
