package basics;

public class MotorbikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(100);

        int ducatiSpeed = ducati.getSpeed();
        ducatiSpeed = ducatiSpeed + 100;
        ducati.setSpeed(ducatiSpeed);

        ducati.increaseSpeed(100);

        System.out.println(ducati.getSpeed());
        honda.setSpeed(80);
        System.out.println(honda.getSpeed());
    }
}
