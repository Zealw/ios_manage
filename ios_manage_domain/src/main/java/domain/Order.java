package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    private String id;
    private int buyerId;
    private double tradeNum;
    private int sellerId;
    private Date orderTime;
    private String orderTimeStr;
    private int orderStatus;
    private String orderStatusStr;
    private double tradePrice;
    private String coinBuyerId;

    public String getCoinBuyerId() {
        return coinBuyerId;
    }

    public void setCoinBuyerId(String coinBuyerId) {
        this.coinBuyerId = coinBuyerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    public double getTradeNum() {
        return tradeNum;
    }

    public void setTradeNum(double tradeNum) {
        this.tradeNum = tradeNum;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatusStr() {
        return orderStatus == 0 ?"等待买家打款":"交易完成";
    }

    public void setOrderStatusStr(String orderStatusStr) {
        this.orderStatusStr = orderStatusStr;
    }

    public double getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(double tradePrice) {
        this.tradePrice = tradePrice;
    }

    public String getOrderTimeStr() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        return simpleDateFormat.format(orderTime);
    }

    public void setOrderTimeStr(String orderTimeStr) {
        this.orderTimeStr = orderTimeStr;
    }
}
