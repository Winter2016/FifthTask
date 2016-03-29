package mypckg;

import java.util.Date;

/**
 * Created by Ксения on 3/27/2016.
 */
public class Purchase {
    private Date buy_date;
    private String seller;
    private String buyer;
    private String book;
    private int amount;
    private int cost;

    public Purchase(Date buy_date, String seller, String buyer, String book, int amount, int cost) {
        this.buy_date = buy_date;
        this.seller = seller;
        this.buyer = buyer;
        this.book = book;
        this.amount = amount;
        this.cost = cost;
    }

    public Purchase() {

    }

    public int getCost() {
        return cost;
    }

    public Date getBuy_date() {
        return buy_date;
    }

    public String getSeller() {
        return seller;
    }

    public String getBuyer() {
        return buyer;
    }

    public String getBook() {
        return book;
    }

    public int getAmount() {
        return amount;
    }

    public void setBuy_date(Date buy_date) {
        this.buy_date = buy_date;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
