package Exercise12_10;

import Exercise12_10.model.Account;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class DemoApp {
    public static void main(String[] args) {
        List<Account> list = new LinkedList<>();
        int count = 0;

        while (true){
            try {
                Account account = new Account(count, "firstName", "lastName", "mail@domain.com", "+1122233334444",
                        "+1122233334444", 1234.12, new Date(), new Date());
                list.add(account);
            }
            catch (OutOfMemoryError exc){
                exc.printStackTrace();
            }

            count++;
        }
    }
}
