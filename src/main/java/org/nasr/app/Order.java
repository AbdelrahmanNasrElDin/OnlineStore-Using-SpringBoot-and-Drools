package org.nasr.app;

public class Order {
    private String name ;
    private String productType;
    private double discount;
    private double price ;
    private double tax;

    public void setName(String name) {
        this.name = name;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }


    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public String getProductType() {
        return productType;
    }


    public double getDiscount() {
        return discount;
    }

    public double getPrice() {
        return price;
    }

    public double getTax() {
        return tax;
    }

    public void totalPrice()
    {

        this.price = (1 + this.tax - this.discount ) * this.price;
        System.out.println(this.price);
    }
}
