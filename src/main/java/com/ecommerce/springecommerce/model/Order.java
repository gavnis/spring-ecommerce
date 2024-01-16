package com.ecommerce.springecommerce.model;

import java.util.Date;

public class Order {
    private Integer id;
    private String number;
    private Date dateCreation;
    private Date dateReceipt;
    private double total;

    public Order(){

    }

    public Order(Integer id, String number, Date dateCreation, Date dateReceipt, double total) {
        this.id = id;
        this.number = number;
        this.dateCreation = dateCreation;
        this.dateReceipt = dateReceipt;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateReceipt() {
        return dateReceipt;
    }

    public void setDateReceipt(Date dateReceipt) {
        this.dateReceipt = dateReceipt;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", dateCreation=" + dateCreation +
                ", dateReceipt=" + dateReceipt +
                ", total=" + total +
                '}';
    }
}
