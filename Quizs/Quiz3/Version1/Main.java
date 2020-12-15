import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;


class Main {
  public static void main(String[] args) {
    ArrayList<Movie> moviesAction = new ArrayList<Movie>();
    ArrayList<Movie> moviesComedy = new ArrayList<Movie>();
    ArrayList<Movie> moviesDrama = new ArrayList<Movie>();
    try
    {
      Scanner inputFile = new Scanner(new File("movies.txt"));
      String title, genre, director;
      int year, rating;
      while (inputFile.hasNext( ) )
      {
        year = inputFile.nextInt();
        title = inputFile.next();
        genre = inputFile.next();
        director = inputFile.next();
        rating = inputFile.nextInt();
        Movie m = new Movie(year,title,genre,director,rating);

        if (m.genre.equals(Movie.ACTION))
          moviesAction.add(m);
        else if (m.genre.equals(Movie.COMEDY))
          moviesComedy.add(m);
        else if (m.genre.equals(Movie.DRAMA))
          moviesDrama.add(m);

      }

      float sumRatingsAction=0, sumRatingsComedy=0, sumRatingsDrama=0;
      for (Movie m: moviesAction){
          sumRatingsAction = sumRatingsAction + m.rating;
      }
      float avgRatingAction = sumRatingsAction/moviesAction.size();

      for (Movie m: moviesComedy){
          sumRatingsComedy = sumRatingsComedy + m.rating;
      }
      float avgRatingComedy = sumRatingsComedy/moviesComedy.size();

      for (Movie m: moviesDrama){
          sumRatingsDrama = sumRatingsDrama + m.rating;
      }
      float avgRatingDrama = sumRatingsDrama/moviesDrama.size();

      System.out.println("\nThere are " + moviesAction.size() + " movies in the Action category with an average rating of " + avgRatingAction + ". \nHere are five random Action movies recommendations:");

      System.out.println(moviesAction.get(3));
      System.out.println(moviesAction.get(35));
      System.out.println(moviesAction.get(10));
      System.out.println(moviesAction.get(12));
      System.out.println(moviesAction.get(28));

      System.out.println("\nThere are " + moviesComedy.size() + " movies in the Comedy category with an average rating of " + avgRatingComedy + ". \nHere are five random Comedy movies recommendations:");
      System.out.println(moviesComedy.get(5));
      System.out.println(moviesComedy.get(23));
      System.out.println(moviesComedy.get(15));
      System.out.println(moviesComedy.get(33));
      System.out.println(moviesComedy.get(19));

      System.out.println("\nThere are " + moviesDrama.size() + " movies in the Drama category with an average rating of " + avgRatingDrama + ". \nHere are five random Drama movies recommendations:");
      System.out.println(moviesDrama.get(4));
      System.out.println(moviesDrama.get(40));
      System.out.println(moviesDrama.get(20));
      System.out.println(moviesDrama.get(22));
      System.out.println(moviesDrama.get(30));

    }
    catch (java.io.FileNotFoundException e)
    {
      System.out.println("File Not Found");
    }
  }
}
