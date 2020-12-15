public class Movie{
  static final String ACTION = "Action";
  static final String HORROR = "Horror";
  static final String MYSTERY = "Mystery";

  String title, director, genre;
  int year, rating;

  Movie(String t, String d, String g, int y, int r){
    title = t;
    director = d;
    genre = g;
    year = y;
    rating = r;
  }

  public String toString()
  {
    //YOU MUST IMPLEMENT THIS METHOD
    //It should RETURN a string value with the movie info as shown on the sample screen
    return "\nTITLE: " + title + " GENRE: " + genre + " DIRECTOR: " + director + " YEAR: " + year + " RATING: " + rating;
  }
}
