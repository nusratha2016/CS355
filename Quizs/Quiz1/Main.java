import java.util.*;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    ArrayList<String> carsList = new ArrayList<String>( Arrays.asList("Mercedes-Benz GLC-Class", "Toyota RAV4", "Kia Telluride", "Mazda CX-5", "BMW X3", "Tesla Model 3", "Toyota Highlander", "Ram 1500", "Toyota Camry", "Subaru Outback", "Jeep Wrangler", "Ford Explorer", "Audi Q7", "Lexus RX 350") );
    ArrayList<Double> carsRatings = new ArrayList<Double>(Arrays.asList(4.0, 4.1, 2.8, 3.2, 4.5, 5.0, 2.7, 2.8, 3.5, 2.9, 3.9, 3.4, 4.8, 4.0));

    System.out.println("\nBest cars in the list:");
    //Print the top cars from carsList according to their rating in the carsRatings list: you should call the corresponding method in the CarsUtil class
    System.out.println(CarsUtil.bestCars(carsList, carsRatings));

    System.out.println("\nRandom car recommendation:");
    //Print a randomly selected car from carsList: you should call the corresponding method in the CarsUtil class
    System.out.println(CarsUtil.randomSuggestion(CarsUtil.bestCars(carsList, carsRatings)));

  }
}
