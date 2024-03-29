package com.lzj.its.sharingpark.bean;

/**
 * Created by lzj on 18-10-29.
 */

public class SharingBean {
    private int shareID;

    private String position;
    private String more;

    private String beginTime;
    private String endTime;

    private double positionA;
    private double positionB;

    private int state;
    private int cost;
    private int stars;

    private UserBean borrower;
    private UserBean renter;

    public int getShareID() {
        return shareID;
    }

    public void setShareID(int shareID) {
        this.shareID = shareID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    public double getPositionA() {
        return positionA;
    }

    public void setPositionA(double positionA) {
        this.positionA = positionA;
    }

    public double getPositionB() {
        return positionB;
    }

    public void setPositionB(double positionB) {
        this.positionB = positionB;
    }

    public UserBean getBorrower() {
        return borrower;
    }

    public void setBorrower(UserBean borrower) {
        this.borrower = borrower;
    }

    public UserBean getRenter() {
        return renter;
    }

    public void setRenter(UserBean renter) {
        this.renter = renter;
    }
}
