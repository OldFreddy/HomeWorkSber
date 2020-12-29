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

        List<Account> accounts = new ArrayList<>();
        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите имя аккаунта");
        String accountName = reader.readLine();

        for (int i = 0; i < accounts.size(); i++) {
            if (accountName.equals(accounts.get(i).getAccountName())) {
                System.out.println("Аккаунт найден! Введите пин-код");
                StringBuilder bufferStr = new StringBuilder();
                for (int j = 0; j < 4;) {
                    try {
                        String s = reader.readLine();
                        char c = s.charAt(0);
                        if (Character.isDigit(c)){
                            j++;
                            System.out.println("Вы ввели число");
                            bufferStr.append(c);
                            System.out.println(bufferStr);

                        } else {
                            throw new NumberFormatException();
                        }
                    } catch (NumberFormatException e){
                        System.err.println("Введено не число");
                    }
                }
                if (bufferStr.length() == 4){
                    Integer pinCode = Integer.parseInt(bufferStr.toString());
                    System.out.println(pinCode.equals(acc1.pinCode));
                }
            }

        }


    }
}
