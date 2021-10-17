package edu.sdccd.cisc191;

//Parent and superclass of the Car, SportsUtilityVehicle, PickupTruck, use Options class. Those others are subclass, children
public class Vehicle {
    //sets the instance variable

    String brand;
    int mileage;
    int price;
    int seats;
    Option[] options;

    //constructor
    public Vehicle(String userBrand, int userMileage, int userPrice, int userSeats,Option[] userOptions )
    {
        //assigns values to the instance variables
        brand= userBrand;
        mileage=userMileage;
        price=userPrice;
        seats=userSeats;
        options=userOptions;
    }
    //returns class instance variables
    protected String getManufacturerName(){return this.brand;}
    protected int getPrice(){return this.price;}
    protected Option[] getOptions(){return options;}
    protected int getMilesOnVehicle(){ return this.mileage;}
    protected int getNumberOfSeats(){return this.seats;}

}
