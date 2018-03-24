package com.ira;

import java.util.Calendar;

public class Car {

    private static int maxId = 0;

    private int id;
    private String producer;
    private String model;
    private int yearOfOutlet;
    private String colour;
    private double price;
    private String registrationNumber;


    public Car(
        String producer,
        String model,
        int yearOfOutlet,
        String colour,
        double price,
        String registrationNumber
    )
    {
        this.setId(++maxId);
        this.setProducer(producer);
        this.setModel(model);
        this.setYearOfOutlet(yearOfOutlet);
        this.setColour(colour);
        this.setPrice(price);
        this.setRegistrationNumber(registrationNumber);
    }

    public int getId()
    {
        return id;
    }

    private void setId(int id)
    {
        this.id = id;
    }

    public String getProducer()
    {
        return producer;
    }

    private void setProducer(String producer)
    {
        this.producer = producer;
    }

    public String getModel()
    {
        return model;
    }

    private void setModel(String model)
    {
        this.model = model;
    }

    public int getYearOfOutlet()
    {
        return yearOfOutlet;
    }

    public int getCarAge()
    {
        return getCurrentYear() - this.getYearOfOutlet();
    }

    private static int getCurrentYear()
    {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    private void setYearOfOutlet(int yearOfOutlet)
    {
        this.yearOfOutlet = yearOfOutlet;
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getRegistrationNumber()
    {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber)
    {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return String.format(
                "Car id=%s, producer=%s, model=%s, yearOfOutlet=%s, colour=%s, price=%s, registrationNumber=%s",
                this.id,
                this.producer,
                this.model,
                this.yearOfOutlet,
                this.colour,
                this.price,
                this.registrationNumber
        );
    }
}
