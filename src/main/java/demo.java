import models.*;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class demo {
    public static void main(String[] args) {
            AccountService account = new AccountService("admin","127.0.0.1");
            account.attach( new Logger());
            account.attach(new Protector());
            account.attach(new Mailer());
           //account.attach( new sayYeah());



            account.login();
            account.logout();


    }

}
