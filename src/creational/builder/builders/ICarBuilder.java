package creational.builder.builders;

import creational.builder.models.Car;
import creational.builder.models.CarType;
import creational.builder.models.Engine;

public interface ICarBuilder {
    void setSeats(int seats);
    void setFuel(double fuel);
    void setEngine(Engine engine);
    void setCarType(CarType carType);

    Car createCar();
    //14.45
}
