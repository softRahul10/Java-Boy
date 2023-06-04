package JavaCore.OOPs.Inheritance;

// Base/ Parent class
class Bicycle{
    // properties
    public int gear;
    public int speed;

    // constructor
    public Bicycle(int gear,int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // the Bicycle class has three methods
    public void applyBrake(int decrement)
    {
        this.speed = this.speed - decrement;
    }

    public void speedUp(int increment)
    {
        speed = this.speed + increment;
    }

    // toString() method to print info of Bicycle
    public String toString()
    {
        return ("No of gears are " + this.gear + "\n"
                + "speed of bicycle is " + this.speed);
    }

}


// Child / Sub class
class MountainBike extends Bicycle{
    // unique properties
    public int seatHeight;

    public MountainBike(int gear,int speed,int seatHeight) {
        super(gear,speed);
        this.seatHeight = seatHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        this.seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + this.seatHeight);
    }
}

public class Language {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(4,100,5);
        System.out.println(mb.toString());
    }
}
