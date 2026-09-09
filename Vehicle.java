
import java.util.Scanner;

// Parent Class
class Vehicle {
    String brand;
    int year;

    void getVehicleData(Scanner sc) {
        System.out.print("Enter Vehicle Brand: ");
        brand = sc.nextLine();

        System.out.print("Enter Manufacturing Year: ");
        year = sc.nextInt();
        sc.nextLine(); // Clear buffer
    }

    void displayVehicle() {
        System.out.println("\n----- VEHICLE DETAILS -----");
        System.out.println("Brand  : " + brand);
        System.out.println("Year   : " + year);
    }
}


// Child Class of Vehicle
class Car extends Vehicle {
    String model;

    void getCarData(Scanner sc) {
        System.out.print("Enter Car Model: ");
        model = sc.nextLine();
    }

    void displayCar() {
        System.out.println("Model  : " + model);
    }
}


// Child Class of Car
class SportCar extends Car {
    String type;
    int engine;

    void getSportCarData(Scanner sc) {
        System.out.print("Enter Car Type: ");
        type = sc.nextLine();

        System.out.print("Enter Engine Capacity (CC): ");
        engine = sc.nextInt();
    }

    void displaySportCar() {
        System.out.println("Type   : " + type);
        System.out.println("Engine : " + engine + " CC");
    }
}


// Main Class
class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating SportCar Object
        SportCar s = new SportCar();

        System.out.println("Enter Sport Car Details");
        System.out.println("-----------------------");

        // Taking input
        s.getVehicleData(sc);
        s.getCarData(sc);
        s.getSportCarData(sc);

        // Displaying output
        s.displayVehicle();
        s.displayCar();
        s.displaySportCar();

        sc.close();
    }
}