package org.example;

public class Movie {

    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private Price price;

    public Movie(String title, Price price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Price getprice() {
        return price;
    }

    public void setprice(Price price) {
        this.price = price;
    }

    public double getPriceCodeCharge(int daysRented){
        return price.getCharge(daysRented);
    }

    public int getFrequentRentalPoints(double daysRented) {
        if (price instanceof NewReleasePrice && daysRented > 1){
            return 2;
        }
        return 1;
    }

}