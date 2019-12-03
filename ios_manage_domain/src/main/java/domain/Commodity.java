package domain;

import java.io.Serializable;
import java.util.List;

public class Commodity implements Serializable {
    private int id;
    private String cname;
    private double cprice;
    private String cimg;
    private List<User> users;

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", cprice=" + cprice +
                ", cimg='" + cimg + '\'' +
                ", users=" + users +
                '}';
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Commodity(int id, String cname, double cprice, String cimg) {

        this.id = id;
        this.cname = cname;
        this.cprice = cprice;
        this.cimg = cimg;
    }

    public Commodity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public double getCprice() {
        return cprice;
    }

    public void setCprice(double cprice) {
        this.cprice = cprice;
    }

    public String getCimg() {
        return cimg;
    }

    public void setCimg(String cimg) {
        this.cimg = cimg;
    }
}
