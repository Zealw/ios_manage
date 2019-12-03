package domain;

public class CoinBuyer {
    private String iid;
    private double tradeNum;
    private double tradePrice;
    private User user;
    private int uid;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public double getTradeNum() {
        return tradeNum;
    }

    public void setTradeNum(double tradeNum) {
        this.tradeNum = tradeNum;
    }

    public double getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(double tradePrice) {
        this.tradePrice = tradePrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
