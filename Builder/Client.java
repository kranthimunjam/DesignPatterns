package Builder;

public class Client {
    public static void main(String[] args) {
        CarBuilder carBuilder = new BasicCarBuilder();
        Director director = new Director(carBuilder);
        director.constructCar();
        Car car = carBuilder.build();
        System.out.println("Car built: " + car);
    }
}
