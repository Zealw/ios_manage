package domain;

public class CoinSeller {
    private String id;
    private double tradeNum;
    private double tradePrice;
    private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
