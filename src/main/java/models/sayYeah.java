package models;

public class sayYeah implements Observer {
    @Override
    public void update(LoginUser user) {
        System.out.println("YEah");
    }
}
