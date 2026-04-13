package Builder;

// The actual product builder is helping use to build is Car. 
public class Car {
    private final String carType;
    private final int seats;
    private final String engine;
    private final String transmission;
    private final boolean hasTripComputer;
    private final boolean hasGPS;

    public Car(String carType, int seats, String engine, String transmission, boolean hasTripComputer, boolean hasGPS) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.hasTripComputer = hasTripComputer;
        this.hasGPS = hasGPS;
    }

    public String getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public boolean hasTripComputer() {
        return hasTripComputer;
    }

    public boolean hasGPS() {
        return hasGPS;
    }
    
}
