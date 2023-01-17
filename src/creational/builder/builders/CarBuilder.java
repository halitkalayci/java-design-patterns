package creational.builder.builders;

import creational.builder.models.Car;
import creational.builder.models.CarType;
import creational.builder.models.Engine;

public class CarBuilder implements ICarBuilder{

    //Referans tip nedeniyle değişiklikler tüm instanceleri etkiliyor bunu fixleyelim..
    Car car = new Car();


    @Override
    public void setSeats(int seats) {
        if(seats>6) seats=6;
        car.setSeats(seats);
    }

    @Override
    public void setFuel(double fuel) {
        car.setFuel(fuel);
    }

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public void setCarType(CarType carType) {
        car.setCarType(carType);
    }

    @Override
    public Car createCar() {
        return car;
    }
}
