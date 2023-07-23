package basics;

public class MotorBike {

    //state
    private int speed;

    MotorBike(int speed){
        this.speed = speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
        System.out.println(speed);
    }

    public void increaseSpeed(int howMuch){
        this.speed = this.speed + howMuch;
    }

    int getSpeed(){
        return this.speed;
    }
    void start() {
        System.out.println("Bike started");
    }
}
