import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;


class Main {
  public static void main(String[] args) {
    ArrayList<Movie> moviesAction = new ArrayList<Movie>();
    ArrayList<Movie> moviesHorror = new ArrayList<Movie>();
    ArrayList<Movie> moviesMystery = new ArrayList<Movie>();
    try
    {
      Scanner inputFile = new Scanner(new File("movies.txt"));
      String title, director, genre;
      int year, rating;
      while (inputFile.hasNext( ) )
      {
        title = inputFile.next();
        director = inputFile.next();

        //HERE: continue reading the rest of the data in the line
        //HERE: create a Movie object with all the values just read
        //HERE: add the object to on of the ArrayList's ONLY if appropriate
        genre = inputFile.next();
        year = inputFile.nextInt();
        rating = inputFile.nextInt();
        Movie m = new Movie(title, director, genre, year, rating);

        if(m.genre.equals(Movie.ACTION))
          moviesAction.add(m);
        else if(m.genre.equals(Movie.HORROR))
          moviesHorror.add(m);
        else if(m.genre.equals(Movie.MYSTERY))
          moviesMystery.add(m);
      }

      //HERE: DISPLAY OUTPUT AS ON THE SAMPLE SCREEN
      float sumRatingsAction = 0, sumRatingsHorror = 0, sumRatingsMystery = 0;
      for(Movie m: moviesAction) {
        sumRatingsAction = sumRatingsAction + m.rating;
      }

      float avgRatingAction = sumRatingsAction / moviesAction.size();
      for(Movie m: moviesHorror) {
        sumRatingsHorror = sumRatingsHorror + m.rating;
      }

      float avgRatingHorror = sumRatingsHorror / moviesHorror.size();
      for(Movie m: moviesMystery) {
        sumRatingsMystery = sumRatingsMystery + m.rating;
      }

      float avgRatingMystery = sumRatingsMystery / moviesMystery.size();

      System.out.println("\nThere are " + moviesAction.size() + " movies in the Action category with an average rating of " + avgRatingAction + ". \nHere are five random Action movies recomendations:");

      System.out.println(moviesAction.get(4));
      System.out.println(moviesAction.get(12));
      System.out.println(moviesAction.get(40));
      System.out.println(moviesAction.get(26));
      System.out.println(moviesAction.get(12));

      System.out.println("\nThere are " + moviesHorror.size() + " movies in the Horror category with an average rating of " + avgRatingHorror + ". \nHere are five random Horror movies recommendations:");

      System.out.println(moviesHorror.get(4));
      System.out.println(moviesHorror.get(16));
      System.out.println(moviesHorror.get(6));
      System.out.println(moviesHorror.get(11));
      System.out.println(moviesHorror.get(20));

      System.out.println("\nThere are " + moviesMystery.size() + " movies in the Mystery category with an average rating of " + avgRatingMystery + ". \nHere are five random Mystery movies recommendations:");

      System.out.println(moviesMystery.get(4));
      System.out.println(moviesMystery.get(14));
      System.out.println(moviesMystery.get(6));
      System.out.println(moviesMystery.get(16));
      System.out.println(moviesMystery.get(8));

    }
    catch (java.io.FileNotFoundException e)
    {
      System.out.println("File Not Found");
    }
  }
}
