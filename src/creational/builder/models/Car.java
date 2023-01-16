package creational.builder.models;

public class Car {
    private int seats;
    private double fuel;
    private Engine engine;
    private CarType carType;

    @Override
    public String toString() {
        return "Seats: " + seats + "\nFuel: " + fuel + "\nEngine Power: " + engine.power + "\nCar Type: " + carType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }
}
