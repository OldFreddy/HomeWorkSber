package HomeWork5_Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class TerminalImpl implements Terminal {

    List<Account> accounts;
    Account accountNow;


    @Override
    public int countOfMoney(Account acc) {

        try {
            if (acc.accountAccess) {
                return acc.getCountOfMoney();
            } else {
                throw new AccountAccessException();
            }
        } catch (AccountAccessException e) {
            System.err.println("Доступ запрещен!");
        }
        return 0;


    }

    @Override
    public void putTheMoney() {

    }

    @Override
    public void getTheMoney() {

    }

    public void terminalInterface() throws IOException {
        System.out.println("Введите имя аккаунта");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        getAccount(reader.readLine());

        System.out.println("Выберите нужное действие \n 1 - Узнать баланс счета\n 2 - пополнить счет\n 3 - снять деньги");
        //System.out.println(accountNow.accountAccess);

    }


    public void getAccount(String accountName) throws IOException {

        //Account accountForCheck = null;

        boolean isAccountSearched = false;

        try {
            for (int i = 0; i < accounts.size(); i++) {

                if (accountName.equals(accounts.get(i).getAccountName())) {
                    accountNow = accounts.get(i);
                    isAccountSearched = true;
                    System.out.println(accountNow.accountAccess + " ");
                    // accountNow = accountForCheck;
                    System.out.println("Аккаунт найден! Введите пин-код");
                    if (!accountNow.accountAccess) {
                        checkPinCode(accountNow);
                    }
                }
            }
            if (!isAccountSearched) {
                throw new notExistAccountException();
            }

        } catch (notExistAccountException e) {
            System.err.println("Такого аккаунта не существует");
            System.exit(0);
        }
    }

    public void checkPinCode(Account acc) throws IOException {
        StringBuilder bufferStr = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int j = 0; j < 4; ) {
            try {
                String s = reader.readLine();
                char c = s.charAt(0);
                if (Character.isDigit(c)) {
                    j++;
                    System.out.println("Вы ввели число");
                    bufferStr.append(c);
                    System.out.println(bufferStr);

                } else {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.err.println("Введено не число");
            }
        }
        if (bufferStr.length() == 4) {
            Integer pinCode = Integer.parseInt(bufferStr.toString());

            if (pinCode.equals(acc.pinCode)) {
                System.out.println(" Введен верный пинкод");
                acc.accountAccess = true;
            } else {
                System.out.println(" Введен неверный пинкод");
                acc.accountAccess = false;
            }

        }


    }


}
