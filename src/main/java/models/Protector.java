package models;

public class Protector implements Observer {
    @Override
    public void update(LoginUser user) {
        if (user.getStatus() == LoginStatus.INVALID) {
            System.out.println("Protector: User " + user.getAccount() + " is invalid. "
                    + "IP " + user.getIp() + " is blocked");
        }
    }
}
