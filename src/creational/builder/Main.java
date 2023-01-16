package creational.builder;

import creational.builder.builders.CarBuilder;
import creational.builder.builders.ICarBuilder;
import creational.builder.directors.CarDirector;
import creational.builder.models.Car;
import creational.builder.models.CarType;
import creational.builder.models.Engine;

public class Main {
    public static void main(String[] args) {
        //
        /*ICarBuilder carBuilder = new CarBuilder();
        carBuilder.setCarType(CarType.SUV);
        carBuilder.setFuel(50);
        carBuilder.setEngine(new Engine());
        carBuilder.setSeats(4);
        Car car = carBuilder.createCar();

        carBuilder.setSeats(2);
        carBuilder.setFuel(100);

        Car car2 = carBuilder.createCar();


        System.out.println(car.toString());
        System.out.println("****************");
        System.out.println(car2.toString());*/

        ICarBuilder builder = new CarBuilder();
        CarDirector director = new CarDirector();
        director.constructSUVCar(builder);
        Car car = builder.createCar();
        System.out.println(car.toString());

    }
}
