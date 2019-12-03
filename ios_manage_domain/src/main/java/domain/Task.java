package domain;

import java.util.Date;

public class Task {
    private int id;
    private Date createDate;
    private int taskLevel;
    private double taskProduct;
    private int containDay;
    private int uid;
    private User user;

    public Task() {
    }

    public Task(Date createDate, int taskLevel, double taskProduct, int containDay, int uid, User user) {
        this.createDate = createDate;
        this.taskLevel = taskLevel;
        this.taskProduct = taskProduct;
        this.containDay = containDay;
        this.uid = uid;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", taskLevel=" + taskLevel +
                ", taskProduct=" + taskProduct +
                ", containDay=" + containDay +
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getTaskLevel() {
        return taskLevel;
    }

    public void setTaskLevel(int taskLevel) {
        this.taskLevel = taskLevel;
    }

    public double getTaskProduct() {
        return taskProduct;
    }

    public void setTaskProduct(double taskProduct) {
        this.taskProduct = taskProduct;
    }

    public int getContainDay() {
        return containDay;
    }

    public void setContainDay(int containDay) {
        this.containDay = containDay;
    }
}
