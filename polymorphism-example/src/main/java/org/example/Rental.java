package org.example;

public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    //Calling this here rather than in customer as the rental class should
    // hold info on the charge
    public double getCharge() {
        return movie.getPriceCodeCharge(daysRented);
    }

    public int getRentalPoints(){
        return movie.getFrequentRentalPoints(daysRented);
    }

}