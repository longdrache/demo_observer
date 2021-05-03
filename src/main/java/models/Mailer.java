package models;

public class Mailer implements  Observer{

    @Override
    public void update(LoginUser user) {
        if (user.getStatus() == LoginStatus.EXPIRED) {
            System.out.println("Mailer: User " + user.getAccount() + " is expired. An email was sent!");
        }
    }
}
