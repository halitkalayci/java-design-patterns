package creational.builder.directors;

import creational.builder.builders.ICarBuilder;
import creational.builder.models.CarType;
import creational.builder.models.Engine;

public class CarDirector {
    public void constructSUVCar(ICarBuilder builder){
        Engine suvEngine = new Engine();
        suvEngine.power = 2.5;
        builder.setFuel(90);
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(suvEngine);
    }
    public void constructRacingCar(ICarBuilder builder){
        Engine sportsEngine = new Engine();
        sportsEngine.power = 5;
        builder.setFuel(40);
        builder.setCarType(CarType.SPORT);
        builder.setSeats(2);
        builder.setEngine(sportsEngine);
    }
}
