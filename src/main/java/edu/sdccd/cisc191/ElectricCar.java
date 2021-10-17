package edu.sdccd.cisc191;

/* ElectricCar inherits from Car which is a children of Vehicle (so it inherits from Vehicle also)
 * Also inherits from the Chargeable interface
 */
public class ElectricCar extends Car implements Chargeable {
    //unique instance vehicle for ElectricCar associated with Chargeable
    private int batteryCharge;

    //ElectricCar constructors calling Car's constructor
    public ElectricCar(String userBrand, int userMileage, int userPrice, int userSeats, Option[] o, int userDoors ) {
        super(userBrand, userMileage, userPrice, userSeats, o, userDoors);
    }
    //batteryCharge getter

    public int getBatteryCharge(){return batteryCharge;}
    //batteryCharge setter to 100
    public  void chargeUp(){batteryCharge=100;}

}
