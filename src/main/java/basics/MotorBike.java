package basics;

public class MotorBike {

    //state
    private int speed;

    //behavour
    //method
    //inputs - int speed
    //outputs - void
    //name - setSpeed

    void setSpeed(int speed) {
        this.speed = speed;
        System.out.println(speed);
    }
    void start() {
        System.out.println("Bike started");
    }
}
