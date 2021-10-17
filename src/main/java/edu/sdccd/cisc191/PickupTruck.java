package edu.sdccd.cisc191;

//Extended from Vehicle class, it is the subclass or children
public class PickupTruck extends Vehicle{

    //special variable specific for PickupTruck
    private int cargoCapacity;

    //constructors
    public PickupTruck(String userBrand, int userMileage, int userPrice, int userSeats, Option[] o, int userCapacity){
        super(userBrand, userMileage, userPrice, userSeats, o);

        cargoCapacity=userCapacity;
    }
    //getter for the spcial variable
    protected int getCargoCapacity(){return this.cargoCapacity;}

}
