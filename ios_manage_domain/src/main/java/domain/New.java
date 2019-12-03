package domain;

import java.util.Date;

public class New {
    private int id;
    private String title;
    private Date date;
    private String nimg;
    private String detail;

    @Override
    public String toString() {
        return "New{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", nimg='" + nimg + '\'' +
                ", detail='" + detail + '\'' +
                ", listType=" + listType +
                '}';
    }

    private int listType;

    public New(int id, String title, Date date, String nimg, String detail, int listType) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.nimg = nimg;
        this.detail = detail;
        this.listType = listType;
    }

    public int getListType() {
        return listType;
    }

    public void setListType(int listType) {
        this.listType = listType;
    }

    public New() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNimg() {
        return nimg;
    }

    public void setNimg(String nimg) {
        this.nimg = nimg;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
