1. Write	SQL	queries	to	retrieve	each	of	the	following:

1. A count of tracks in the tracks table.
SELECT COUNT (name) FROM tracks;

2. The Name, Composer, and Milliseconds from the tracks table.
SELECT name, composer,milliseconds FROM tracks;

3. Album Title, track Name, and Composer for all tracks. The results should be sorted.
alphabetically by Composer.
SELECT * FROM albums INNER JOIN  tracks ON albums.Title = tracks.Name ORDER BY Composer ASC;

4. The list of tracks (only the Name) in the “Balls to the Wall” album.
SELECT Tracks.Name FROM albums, Tracks WHERE albums.Albumid=Tracks.AlbumId AND albums.Title='Balls to the Wall';

5. A count of tracks per album (list only the album Title and the number of tracks in the
album).
SELECT COUNT (TrackId)Title FROM tracks GROUP BY(TrackId),DESC;

2. A	selection	from	the	albums and	tracks tables	is	given	in	the	next	page. Using	ONLY
the	data	given	in	the	next	page,	show	the	result	of	the	following	queries:

1. SELECT albums.Title, tracks.Name FROM tracks,albums
WHERE tracks.Albumid= albums.Albumid AND albums.Title LIKE "L%";
Title	                  Name
Let There Be Rock	      Go Down
Let There Be Rock	      Dog Eat Dog
Let There Be Rock	      Let There Be Rock
Let There Be Rock	      Bad Boy Boogie
Let There Be Rock	      Problem Child

2. SELECT DISTINCT Composer FROM tracks;
Composer
Angus Young, Malcolm Young, Brian Johnson
null
F. Baltes, S. Kaufman, U. Dirkscneider & W. Hoffman
F. Baltes, R.A. Smith-Diesel, S. Kaufman, U. Dirkscneider & W. Hoffman
Deaffy & R.A. Smith-Diesel
AC/DC
Steven Tyler, Joe Perry, Jack Blades, Tommy Shaw

3. SELECT COUNT(*) FROM tracks WHERE Albumid=5;
Output = 15

4. SELECT GenreId, COUNT(*) FROM tracks GROUP BY GenreId;
GenreId	       COUNT(*)
1	              1297
2	              130
3	              374
4	              332
5               12

5. SELECT Name FROM tracks WHERE Name LIKE "%Die%";
Name
We Die Young
Momma's Gotta Die Tonight
Die Die My Darling
Soldier Of Fortune
Live and Let Die
