package edu.sdccd.cisc191;

//GasCar is extended from Car, it is the children the subclass. Also implements Combustible
public class GasCar extends Car implements Combustible{

    //set instance variable
    private int fuelLevel;
    //constructor
    public GasCar(String userBrand, int userMileage, int userPrice, int userSeats, Option[] o, int userDoors){
        super(userBrand, userMileage, userPrice, userSeats, o, userDoors);

    }
    //getter
    public int getFuelLevel() {return fuelLevel;}
    //setter set the fuel level to 100
    public void tankUp(){fuelLevel=100;}

}
