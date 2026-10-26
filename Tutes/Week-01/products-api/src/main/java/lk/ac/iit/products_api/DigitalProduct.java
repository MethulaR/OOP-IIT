package lk.ac.iit.products_api;

import java.io.Serializable;

public class DigitalProduct extends Product implements Discountable {

    private String downloadUrl;
    private double fileSizeMB;

    // no-arg constructor: Jackson needs this to build
    // an object from an incoming JSON request body
    public DigitalProduct() {
    }

    public DigitalProduct(Long id, String name, double price,
                          String downloadUrl, double fileSizeMB) {
        super(id, name, price); // MUST be the first statement
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }
    @Override
    public String getSummary() {
        return "Digital:" + getName()
                + "| Download URL: "+ downloadUrl;
    }

    private double discountedPrice;

    @Override
    public void applyDiscount(double rate){
        double cappedRate = Math.min(rate, discountedPrice);
        this.discountedPrice = getPrice() * (1-cappedRate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}