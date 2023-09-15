package Practice_4_1.Task_10;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Car", 4, 10);
        Plane plane = new Plane("Plane", 300, 500);
        Ship ship = new Ship("Ship", 1000, 2000);
        Train train = new Train("Train", 5000, 10000);

        System.out.println(car.calculateCargoTransportCost());
        System.out.println(plane.calculateCargoTransportTime());
        System.out.println(ship.calculatePassengerTransportCost());
        System.out.println(train.calculatePassengerTransportTime());
    }
}
