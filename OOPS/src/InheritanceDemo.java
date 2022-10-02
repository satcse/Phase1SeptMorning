class  Bicycle
{
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public Bicycle() {
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void applyBrake(int decrement)
    {
        speed -=decrement;
    }
    public void speedUp(int increment)
    {
        speed +=increment;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return (super.toString()+"\n Seat Height is: "+seatHeight);
    }
}
public class InheritanceDemo {

    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3,100,25);
        mb.speedUp(50);
        mb.applyBrake(20);
        System.out.println(mb.toString());
    }
}
