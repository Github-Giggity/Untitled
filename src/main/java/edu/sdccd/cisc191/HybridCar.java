package edu.sdccd.cisc191;

//HybridCar is the children/subclass of Car which in turn is the children/subclass of Vehicle.
//implements Combustible and Chargeable
public class HybridCar extends Car implements Combustible, Chargeable{
    //declare instance variables
    private int batteryCharge;
    private int fuelLevel;

    //constructor
    public HybridCar(String userBrand, int userMileage, int userPrice, int userSeats, Option[] o, int userDoors){
        super(userBrand, userMileage, userPrice, userSeats, o, userDoors);
    }
    //getter fuel
    public int getFuelLevel(){return fuelLevel;}
    // setter tank fuel level
    public void tankUp(){fuelLevel=100;}
    //getter batteryCharge
    public int getBatteryCharge(){return batteryCharge;}
    //setter batteryCharge
    public void chargeUp(){batteryCharge=100;}

}
