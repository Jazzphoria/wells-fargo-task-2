package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private Long portfolioId;



   /* @Column(name = "clientId", nullable = false )
    private long clientId;*/

    @ManyToOne
    @JoinColumn(name = "clientId" , nullable = false )
    private Client clientId;

    @Column(nullable = false)
    private Date creationdate;

    protected Portfolio() {

    }


    public Portfolio(Date creationdate, Client clientId, Long portfolioId) {
        this.creationdate = creationdate;
        this.clientId = clientId;
        this.portfolioId = portfolioId;
    }



    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }
    public Date getcreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }
}
