package models;

public class LoginUser {
    private String account;
    private String ip;
    private LoginStatus status;


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public LoginStatus getStatus() {
        return status;
    }

    public void setStatus(LoginStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "account='" + account + '\'' +
                ", ip='" + ip + '\'' +
                ", status=" + status +
                '}';
    }
}
