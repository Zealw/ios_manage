package domain;

import java.text.DecimalFormat;

public class Coin {
    private int id;
    private double coinNum;
    DecimalFormat df = new DecimalFormat();
    private int activeness;
    private double evrValue;
    private int inviteNum;
    private int dailyProduct;
    private int uid;
    private User user;

    @Override
    public String toString() {
        return "Coin{" +
                "id=" + id +
                ", coinNum=" + coinNum +
                ", df=" + df +
                ", activeness=" + activeness +
                ", evrValue=" + evrValue +
                ", inviteNum=" + inviteNum +
                ", dailyProduct=" + dailyProduct +
                ", uid=" + uid +
                ", count=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public DecimalFormat getDf() {
        return df;
    }

    public void setDf(DecimalFormat df) {
        this.df = df;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCoinNum() {
        coinNum = Double.parseDouble(df.format(coinNum));
        return coinNum;
    }

    public void setCoinNum(double coinNum) {
        coinNum = Double.parseDouble(df.format(coinNum));
        this.coinNum = coinNum;
    }

    public int getActiveness() {
        return activeness;
    }

    public void setActiveness(int activeness) {
        this.activeness = activeness;
    }

    public double getEvrValue() {
        return evrValue;
    }

    public void setEvrValue(double evrValue) {
        this.evrValue = evrValue;
    }

    public int getInviteNum() {
        return inviteNum;
    }

    public void setInviteNum(int inviteNum) {
        this.inviteNum = inviteNum;
    }

    public int getDailyProduct() {
        return dailyProduct;
    }

    public void setDailyProduct(int dailyProduct) {
        this.dailyProduct = dailyProduct;
    }
}
