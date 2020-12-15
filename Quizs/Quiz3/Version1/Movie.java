public class Movie{
  static final String ACTION = "Action";
  static final String COMEDY = "Comedy";
  static final String DRAMA = "Drama";

  String title, genre, director;
  int year, rating;

  Movie(int y, String t, String g, String d, int r){
    year = y;
    title = t;
    genre = g;
    director = d;
    rating = r;
  }

  public String toString()
  {
    return "TITLE: " + title + " GENRE: " + genre + " DIRECTOR: " + director + " YEAR: " + year + " RATING: " + rating ;
  }
}
