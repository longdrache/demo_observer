package models;

public class Logger implements Observer {

    @Override
    public void update(LoginUser user) {
        if (!user.getStatus().equals(LoginStatus.LOGOUT))
            System.out.println("Logger: " + user);

        else
            System.out.println("LOG OUT");


    }
}
