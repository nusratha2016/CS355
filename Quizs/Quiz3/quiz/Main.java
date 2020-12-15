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
        director = inputFile.next();
        year = inputFile.nextInt();
        rating = inputFile.nextInt();
        Movie m = new Movie(title,genre, director,year,rating);

        if (m.genre.equals(Movie.ACTION))
          moviesAction.add(m);
        else if (m.genre.equals(Movie.WESTERN))
          moviesWestern.add(m);
        else if (m.genre.equals(Movie.COMEDY))
          moviesComedy.add(m);
      }

      float sumRatingsAction=0, sumRatingsComedy=0, sumRatingsWestern=0;
      for (Movie m: moviesAction){
          sumRatingsAction = sumRatingsAction + m.rating;
      }
      float avgRatingAction = sumRatingsAction/moviesAction.size();

      for (Movie m: moviesComedy){
          sumRatingsComedy = sumRatingsComedy + m.rating;
      }
      float avgRatingComedy = sumRatingsComedy/moviesComedy.size();

      for (Movie m: moviesWestern){
          sumRatingsWestern = sumRatingsWestern + m.rating;
      }
      float avgRatingWestern = sumRatingsWestern/moviesWestern.size();

      System.out.println("\nThere are " + moviesAction.size() + " movies in the Action category with an average rating of " + avgRatingAction + ". \nHere are five random Action movies recommendations:");
      for (int i=0; i<5; i++)
        System.out.println(moviesAction.get((int) (Math.random()*moviesAction.size())));

      System.out.println("\nThere are " + moviesWestern.size() + " movies in the Western category with an average rating of " + avgRatingWestern + ". \nHere are five random Western movies recommendations:");
      for (int i=0; i<5; i++)
        System.out.println(moviesWestern.get((int) (Math.random()*moviesWestern.size())));

      System.out.println("\nThere are " + moviesComedy.size() + " movies in the Comedy category with an average rating of " + avgRatingComedy + ". \nHere are five random Comedy movies recommendations:");
      for (int i=0; i<5; i++)
        System.out.println(moviesComedy.get((int) (Math.random()*moviesComedy.size())));

    }
    catch (java.io.FileNotFoundException e)
    {
      System.out.println("File Not Found");
    }
  }
}
