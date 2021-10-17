package edu.sdccd.cisc191;

//subclass children SportsUtilityVehicle inherits from superclass parent Vehicle
public class SportsUtilityVehicle extends Vehicle{
    //set instance variable
    private int MaxTowingWeight;
    //constructor

    public SportsUtiityVehicle(String userBrand, int userMileage, int userPrice, int userSeats, Option[] o, int userTowingWeight){
        super(userBrand, userMileage,userPrice,userSeats, o);
        MaxTowingWeight = userTowingWeight;

    }

    //getter
    protected int getMaxTowingWeight()
    {
        return this.MaxTowingWeight;
    }
}
