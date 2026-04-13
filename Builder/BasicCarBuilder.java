package Builder;

public class BasicCarBuilder implements CarBuilder {
    private String carType;
    private int seats;
    private String engine;
    private String transmission;
    private boolean hasTripComputer;
    private boolean hasGPS;
    
    @Override
    public void buildCarType() {
        System.out.println("car type: " + carType);
    }

    @Override
    public void buildSeats() {
        System.out.println("number of seats: " + seats);
    }

    @Override
    public void buildEngine() {
        System.out.println("engine: " + engine);
    }

    @Override
    public void buildTransmission() {
        System.out.println("transmission: " + transmission);
    }

    @Override
    public void buildTripComputer() {
        System.out.println("Trip computer: " + (hasTripComputer ? "Yes" : "No"));
    }

    @Override
    public void buildGPS() {
        System.out.println("GPS: " + (hasGPS ? "Yes" : "No"));
    }

    public Car build(){
        return new Car(carType, seats, engine, transmission, hasTripComputer, hasGPS);
    }
    
}
