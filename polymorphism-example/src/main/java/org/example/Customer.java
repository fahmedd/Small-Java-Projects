package org.example;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {

            Rental each = (Rental) rentals.nextElement();

            double charge = each.getCharge();

            //Pricing rules here also violate single responsibility principle
            frequentRenterPoints+= each.getRentalPoints();

            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(charge) + "\n";
            totalAmount += charge;

        }

        result += "You owed " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points\n";

        return result;
    }


    private String name;
    private Vector rentals = new Vector();
}