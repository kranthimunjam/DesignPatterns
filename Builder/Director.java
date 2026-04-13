package Builder;

// Defines the order of building the car. It uses the CarBuilder interface to build the car step by step.
// It may not know the details of how the car is built, but it knows the sequence of building steps.
public class Director {
    private CarBuilder carBuilder;

    // Director is initialized with a CarBuilder, which it will use to construct the car.
    public Director(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void constructCar() {
        carBuilder.buildCarType();
        carBuilder.buildSeats();
        carBuilder.buildEngine();
        carBuilder.buildTransmission();
        carBuilder.buildTripComputer();
        carBuilder.buildGPS();
    }
}
