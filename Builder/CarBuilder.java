package Builder;

// the interface for building different parts of the car.
public interface CarBuilder {
    void buildCarType();
    void buildSeats();
    void buildEngine();
    void buildTransmission();
    void buildTripComputer();
    void buildGPS(); 
    Car build();
} 

