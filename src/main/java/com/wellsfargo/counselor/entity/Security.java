package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String quantity;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Integer purchaseprice;

    @Column(nullable = false)
    private Date purchaseDate;


    @ManyToOne
    @JoinColumn(name = "portfolioId" , nullable = false )
    private Portfolio portfolioId;


    protected Security () {

    }

    public Security (Portfolio portfolioId, String name, String quantity, String category, Integer purchaseprice, Date purchaseDate) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
        this.purchaseprice = purchaseprice;
        this.purchaseDate = purchaseDate;
        this.portfolioId = portfolioId;
    }

    public long getSecurityId() {
        return securityId;
    }



    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getquantity() {
        return quantity;
    }

    public void setquantity(String quantity) {
        this.quantity = quantity;
    }

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        this.category = category;
    }

    public Integer getpurchaseprice() {
        return purchaseprice;
    }

    public void setpurchaseprice(Integer purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public Date getpurchaseDate() {
        return purchaseDate;
    }

    public void setpurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Portfolio getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Portfolio portfolioId) {
        this.portfolioId = portfolioId;
    }
}
