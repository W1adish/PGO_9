
public class Main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "M8 Competition", 2024, 500, 21);
        Truck truck = new Truck("Volvo", "FH16 Aero", 2024, 600, 40, 10);

        System.out.println("Car Information:");
        car.displayInfo();
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " miles/gallon");

        System.out.println("\nTruck Information:");
        truck.displayInfo();
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " miles/gallon");
    }
}