package Practice_4_1.Task_10;

abstract class Transport {
    private String name;
    private int passengerCapacity;
    private int cargoCapacity;

    public Transport(String name, int passengerCapacity, int cargoCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
    }

    public abstract double calculatePassengerTransportTime();

    public abstract double calculatePassengerTransportCost();

    public abstract double calculateCargoTransportTime();

    public abstract double calculateCargoTransportCost();

    public String getName() {
        return name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }
}

class Car extends Transport {
    public Car(String name, int passengerCapacity, int cargoCapacity) {
        super(name, passengerCapacity, cargoCapacity);
    }

    @Override
    public double calculatePassengerTransportTime() {
        double averageSpeedKmph = 60;
        return getPassengerCapacity() / (averageSpeedKmph * 1.0);
    }

    @Override
    public double calculatePassengerTransportCost() {
        double passengerCost = 10;
        return getPassengerCapacity() * passengerCost;
    }

    @Override
    public double calculateCargoTransportTime() {
        double averageSpeedKmph = 80;
        return getCargoCapacity() / (averageSpeedKmph * 1.0);
    }

    @Override
    public double calculateCargoTransportCost() {
        double cargoCostPerKg = 0.5;
        return getCargoCapacity()    * cargoCostPerKg;
    }
}

// Подкласс Самолет
class Plane extends Transport {
    public Plane(String name, int passengerCapacity, int cargoCapacity) {
        super(name, passengerCapacity, cargoCapacity);
    }

    @Override
    public double calculatePassengerTransportTime() {
        double averageSpeedKmph = 800;
        return getPassengerCapacity() / (averageSpeedKmph * 1.0);
    }

    @Override
    public double calculatePassengerTransportCost() {
        double passengerCost = 200;
        return getPassengerCapacity() * passengerCost;
    }

    @Override
    public double calculateCargoTransportTime() {
        double averageSpeedKmph = 500;
        return getCargoCapacity() / (averageSpeedKmph * 1.0);
    }

    @Override
    public double calculateCargoTransportCost() {
        double cargoCostPerKg = 1.0;
        return getCargoCapacity() * cargoCostPerKg;
    }
}

// Подкласс Поезд
class Train extends Transport {
    public Train(String name, int passengerCapacity, int cargoCapacity) {
        super(name, passengerCapacity, cargoCapacity);
    }

    @Override
    public double calculatePassengerTransportTime() {
        double averageSpeedKmph = 50;
        return getPassengerCapacity() / (averageSpeedKmph * 1.0);
    }

    @Override
    public double calculatePassengerTransportCost() {
        double passengerCost = 1000;
        return getPassengerCapacity() * passengerCost;
    }

    @Override
    public double calculateCargoTransportTime() {
        double averageSpeedKmph = 40;
        return getCargoCapacity() / (averageSpeedKmph * 1.0);
    }

    @Override
    public double calculateCargoTransportCost() {
        double cargoCostPerKg = 0.2;
        return getCargoCapacity() * cargoCostPerKg;
    }
}

// Подкласс Корабль
class Ship extends Transport {
    public Ship(String name, int passengerCapacity, int cargoCapacity) {
        super(name, passengerCapacity, cargoCapacity);
    }

    @Override
    public double calculatePassengerTransportTime() {
        double averageSpeedKmph = 80;
        return getPassengerCapacity() / (averageSpeedKmph * 1.0);
    }

    @Override
    public double calculatePassengerTransportCost() {
        double passengerCost = 500;
        return getPassengerCapacity() * passengerCost;
    }

    @Override
    public double calculateCargoTransportTime() {
        double averageSpeedKmph = 60;
        return getCargoCapacity() / (averageSpeedKmph * 1.0);
    }

    @Override
    public double calculateCargoTransportCost() {
        double cargoCostPerKg = 0.7;
        return getCargoCapacity() * cargoCostPerKg;
    }
}
