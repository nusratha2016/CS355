import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

class Main {
  public static void main(String[] args) {
    ArrayList<Movie> moviesAction = new ArrayList<Movie>();
    ArrayList<Movie> moviesComedy = new ArrayList<Movie>();
    ArrayList<Movie> moviesWestern = new ArrayList<Movie>();
    try
    {
      Scanner inputFile = new Scanner(new File("movies.txt"));
      String title, genre, director;
      int year, rating;
      while (inputFile.hasNext( ) )
      {
        title = inputFile.next();
        genre = inputFile.next();

        //HERE: continue reading the rest of the data in the line
        //HERE: create a Movie object with all the values just read
        //HERE: add the object to on of the ArrayList's ONLY if appropriate
        director = inputFile.next();
        year = inputFile.nextInt();
        rating = inputFile.nextInt();
        Movie m = new Movie(title, director, genre, year, rating);

        if(m.genre.equals(Movie.ACTION))
          moviesAction.add(m);
        else if(m.genre.equals(Movie.WESTERN))
          moviesWestern.add(m);
        else if(m.genre.equals(Movie.COMEDY))
          moviesComedy.add(m);
      }

      //HERE: DISPLAY OUTPUT AS ON THE SAMPLE SCREEN
      float sumRatingsAction = 0, sumRatingsWestern = 0, sumRatingsComedy = 0;
      for(Movie m: moviesAction) {
        sumRatingsAction = sumRatingsAction + m.rating;
      }

      float avgRatingAction = sumRatingsAction / moviesAction.size();
      for(Movie m: moviesWestern) {
        sumRatingsWestern = sumRatingsWestern + m.rating;
      }

      float avgRatingsWestern = sumRatingsWestern / moviesWestern.size();
      for(Movie m: moviesComedy) {
        sumRatingsComedy = sumRatingsComedy + m.rating;
      }

      float avgRatingsComedy = sumRatingsComedy / moviesComedy.size();

      System.out.println("\nThere are " + moviesAction.size() + " movies in the Action category with an average rating of " + avgRatingAction + ". \nHere are five random Action movies recomendations:");

      System.out.println(moviesAction.get(4));
      System.out.println(moviesAction.get(12));
      System.out.println(moviesAction.get(40));
      System.out.println(moviesAction.get(26));
      System.out.println(moviesAction.get(12));

      System.out.println("\nThere are " + moviesWestern.size() + " movies in the Western category with an average rating of " + avgRatingsWestern + ". \nHere are five random Western movies recommendations:");

      System.out.println(moviesWestern.get(4));
      System.out.println(moviesWestern.get(16));
      System.out.println(moviesWestern.get(6));
      System.out.println(moviesWestern.get(11));
      System.out.println(moviesWestern.get(20));

      System.out.println("\nThere are " + moviesComedy.size() + " movies in the Comedy category with an average rating of " + avgRatingsComedy + ". \nHere are five random Comedy movies recommendations:");

      System.out.println(moviesComedy.get(4));
      System.out.println(moviesComedy.get(14));
      System.out.println(moviesComedy.get(6));
      System.out.println(moviesComedy.get(16));
      System.out.println(moviesComedy.get(66));

      }
      catch (java.io.FileNotFoundException e)
      {
      System.out.println("File Not Found");
      }
    }
  }
