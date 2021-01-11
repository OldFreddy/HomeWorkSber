package HomeWork5_Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class TerminalImpl implements Terminal {

    List<Account> accounts;
    Account accountNow;
    int accountAction = -1;


    @Override
    public void countOfMoney(Account acc) {

        try {
            if (acc.accountAccess) {
                System.out.println("\n Баланс аккаунта " + acc.getCountOfMoney() + "\n");
            } else {
                throw new AccountAccessException();
            }
        } catch (AccountAccessException e) {
            System.err.println("\nДоступ запрещен!\n");
        }
    }

    @Override
    public void putTheMoney(Account acc, int money) {
        acc.putTheMoney(money);
    }

    @Override
    public void getTheMoney(Account acc, int money) {
        if (acc.getCountOfMoney() > 0 && acc.getCountOfMoney() >= money) {
            acc.getTheMoney(money);
            countOfMoney(acc);
        } else {
            System.err.println("\nНедостаточно денег на балансе\n");
        }
    }

    public void terminalInterface() throws IOException {
        System.out.println("\nВведите имя аккаунта\n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        getAccount(reader.readLine());


        while (true) {
            if (accountNow.accountAccess) {
                System.out.println("""
                        Выберите нужное действие\s
                         1 - Узнать баланс счета
                         2 - пополнить счет
                         3 - снять деньги\s
                         4 - Завершить работу с терминалом""");
                accountAction = Integer.parseInt(reader.readLine());

                switch (accountAction) {
                    case 1:
                        countOfMoney(accountNow);
                        break;
                    case 2:
                        System.out.println("\n Введите сумму \n");
                        try {
                            int sum = Integer.parseInt(reader.readLine());
                            putTheMoney(accountNow, sum);
                        } catch (NumberFormatException e) {
                            System.err.println("\nВведено не число\n");
                        }
                        break;
                    case 3:
                        try {
                            int sum = Integer.parseInt(reader.readLine());
                            getTheMoney(accountNow, sum);
                        } catch (NumberFormatException e) {
                            System.err.println("Введено не число");
                        }
                    case 4:
                        System.exit(0);
                }
            }
        }
    }

    public void getAccount(String accountName) throws IOException {
        boolean isAccountSearched = false;
        try {
            for (int i = 0; i < accounts.size(); i++) {
                if (accountName.equals(accounts.get(i).getAccountName())) {
                    accountNow = accounts.get(i);
                    isAccountSearched = true;
                    System.out.println("\nАккаунт найден! Введите пин-код\n");
                    if (!accountNow.accountAccess) {
                        checkPinCode(accountNow);
                    }
                }
            }
            if (!isAccountSearched) {
                throw new notExistAccountException();
            }
        } catch (notExistAccountException e) {
            System.err.println("\nТакого аккаунта не существует\n");
            System.exit(0);
        }
    }

    public void checkPinCode(Account acc) throws IOException {
        StringBuilder bufferStr = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numOfIncorrectPasswordEnter = 0;
        boolean isBlocked = false;

        for (int j = 0; j < 4; ) {
            try {
                String s = reader.readLine();
                char c = s.charAt(0);
                if (Character.isDigit(c)) {
                    j++;
                    //System.out.println("\nВы ввели число\n");
                    bufferStr.append(c);
                    System.out.println(bufferStr);

                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.err.println("\nВведено не число\n");
            }
        }
        if (bufferStr.length() == 4) {
            Integer pinCode = Integer.parseInt(bufferStr.toString());

            if (pinCode.equals(acc.pinCode)) {
                System.out.println("\nВведен верный пинкод\n");
                acc.accountAccess = true;
                numOfIncorrectPasswordEnter = 0;
            } else {
                System.err.println(" Введен неверный пинкод");
                numOfIncorrectPasswordEnter++;
                acc.accountAccess = false;
            }
        }
    }
}
