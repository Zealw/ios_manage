package domain;

import java.util.Date;
import java.util.List;

public class User {
    private int id;
    private String phoneNum;
    private String username;
    private String password;
    private String uimg;
    private String inviter;
    private String certifyYoN;
    private Coin coin;
    private List<Commodity> commodities;
    private List<Task> tasks;
    private Date date;


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", phoneNum='" + phoneNum + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", uimg='" + uimg + '\'' +
                ", inviter='" + inviter + '\'' +
                ", certifyYoN='" + certifyYoN + '\'' +
                ", coin=" + coin +
                ", commodities=" + commodities +
                ", tasks=" + tasks +
                ", date=" + date +
                '}';
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public List<Commodity> getCommodities() {
        return commodities;
    }

    public void setCommodities(List<Commodity> commodities) {
        this.commodities = commodities;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUimg() {
        return uimg;
    }

    public void setUimg(String uimg) {
        this.uimg = uimg;
    }

    public String getInviter() {
        return inviter;
    }

    public void setInviter(String inviter) {
        this.inviter = inviter;
    }


    public String getCertifyYoN() {
        return certifyYoN;
    }

    public void setCertifyYoN(String certifyYoN) {
        this.certifyYoN = certifyYoN;
    }

    public User() {
    }

    public User(int id, String phoneNum, String username, String password, String uimg, String inviter, String buyOrSell, String certifyYoN) {
        this.id = id;
        this.phoneNum = phoneNum;
        this.username = username;
        this.password = password;
        this.uimg = uimg;
        this.inviter = inviter;
        this.certifyYoN = certifyYoN;
    }
}
