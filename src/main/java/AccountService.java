
import models.*;

import java.util.ArrayList;
import java.util.List;


public class AccountService implements Subject {

        private LoginUser user;
        protected List<Observer> observers = new ArrayList<>();

        public AccountService(String account, String ip) {
            user = new LoginUser();
            user.setAccount(account);
            user.setIp(ip);
        }

        @Override
        public void attach(Observer observer) {
            if (!observers.contains(observer))
                observers.add(observer);
        }



        @Override
        public void notifyAllObserver() {
            for (Observer observer : observers) {
                observer.update(user);
            }
        }

        public void changeStatus(LoginStatus status) {
            user.setStatus(status);
            System.out.println("Status is changed");
            this.notifyAllObserver();
        }

        public void login() {

            if (!this.isValidIP()) {
                user.setStatus(LoginStatus.INVALID);
            } else if (this.isValidId()) {
                user.setStatus(LoginStatus.SUCCESS);
            } else {
                user.setStatus(LoginStatus.FAILURE);
            }

            System.out.println("Login is handled");
            this.notifyAllObserver();
        }
        public void logout(){
            user.setStatus(LoginStatus.LOGOUT);
            System.out.println("Logout is handled");
            this.notifyAllObserver();

        }
        private boolean isValidIP() {

            return "127.0.0.1".equals(user.getIp());
        }

        private boolean isValidId() {
            return "admin"==user.getAccount()?true:false;
        }

}
