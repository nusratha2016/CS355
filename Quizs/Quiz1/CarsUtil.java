import java.util.*;

class CarsUtil {

  //returns the median value from the list of ratings that it receives as parameter
  //DO NOT MODIFY THIS METHOD
  public static double median(ArrayList<Double> a){
    ArrayList<Double> sortedratings = (ArrayList<Double>) a.clone();
    Collections.sort(sortedratings);
    return sortedratings.get(sortedratings.size()/2);
    //return ratings;
  }

  //Returns the list of cars from "carsList" that meet the top car criteria
  //Top Car: cars with rating >= median rating
  public static ArrayList<String> bestCars(ArrayList<String> carsList, ArrayList<Double> ratings)
  {
    ArrayList<String> result = new ArrayList<String>();
    //YOUR CODE GOES HERE: add cars that meet the top car criteria to the result
    //double med = median(ratings);
    for(int i = 0; i < ratings.size(); i++) {
      if(ratings.get(i) >= median(ratings)) {
        result.add(carsList.get(i));
      }
    }
    return result;
  }

  //randomly selects a car from "carsList"
  public static String randomSuggestion(ArrayList<String> carsList) {
    //YOUR CODE GOES HERE
    //modify the return value below
    int rand = (int) (Math.random() * carsList.size());
    return "Telsa Model 3";
  }
}
