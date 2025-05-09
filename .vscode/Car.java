import java.util.Scanner;

public class Car {
    String model;
    int year;

    // Constructor 1: No parameters
    public Car() {
        model = "Unknown";
        year = 0;
    }

    // Constructor 2: One parameter
    public Car(String model) {
        this.model = model;
        this.year = 2024; // default year
    }

    // Constructor 3: Two parameters
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        // Input for first car (no input, uses default constructor)
        try (Scanner scanner = new Scanner(System.in)) {
            // Input for first car (no input, uses default constructor)
            Car car1 = new Car();
            
            // Input for second car (only model)
            System.out.print("Enter car model for Car 2: ");
            String model2 = scanner.nextLine();
            Car car2 = new Car(model2);
            
            // Input for third car (model and year)
            System.out.print("Enter car model for Car 3: ");
            String model3 = scanner.nextLine();
            System.out.print("Enter car year for Car 3: ");
            int year3 = scanner.nextInt();
            Car car3 = new Car(model3, year3);
            
            // Display info for all cars
            System.out.println("\n--- Car Details ---");
            car1.displayInfo(); // default
            car2.displayInfo(); // model from user, default year
            car3.displayInfo(); // both model and year from user
        }
    }
}
