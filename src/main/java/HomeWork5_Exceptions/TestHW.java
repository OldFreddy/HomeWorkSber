package HomeWork5_Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestHW {
    public static void main(String[] args) throws IOException {
        //создаем аккаунты
        Account acc1 = new Account("acc1", 1000, 1111);
        Account acc2 = new Account("acc2", 500, 2222);
        Account acc3 = new Account("acc3", 1500, 3333);
        //создаем терминал
        TerminalImpl newTerminal = new TerminalImpl();
        List<Account> accounts = new ArrayList<>();
        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);
        newTerminal.accounts = accounts;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        System.out.println("Введите имя аккаунта");
//        String accountName = reader.readLine();
//
//        newTerminal.getAccount(accountName);
//        System.out.println(newTerminal.countOfMoney(newTerminal.accountNow));
        newTerminal.terminalInterface();


    }




}
