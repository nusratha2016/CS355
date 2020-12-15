public class Movie{
  static final String ACTION = "Action";
  static final String WESTERN = "Western";
  static final String COMEDY = "Comedy";


  String title, director, genre;
  int year, rating;

  Movie(String t, String g, String d, int y, int r){
    title = t;
    genre = g;
    director = d;
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
