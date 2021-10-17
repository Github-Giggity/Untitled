package edu.sdccd.cisc191;


//Car is extended from Vehicle class, it is the children subclass, inherits everything
public class Car extends Vehicle {
    //Car's own variable
    private int numDoors;

    //Car constructors that will take into account Vehicle constructor
    public Car(String userBrand, int userMileage, int userPrice, int userSeats, Option[] o, int userDoors)
    {
        super(userBrand, userMileage, userPrice, userSeats, o);
        numDoors=userDoors;
    }
    //returns numDoors
    protected int getNumberOfDoors(){return this.numDoors;}
}
