package org.nasr.app;

public class Order {
    private String name ;
    private String cardType;
    private int discount;
    private int price ;

    public String getName() {
        return name;
    }

    public String getCardType() {
        return cardType;
    }

    public int getDiscount() {
        return discount;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}