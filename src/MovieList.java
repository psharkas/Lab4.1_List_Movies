import java.util.ArrayList;
import java.util.Scanner;

public class MovieList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean cont = true;
		ArrayList<Movie> list = new ArrayList<>();
		ArrayList<String> genres = new ArrayList<>();

		list.add(new Movie("The Godfather", "Drama"));
		list.add(new Movie("Demon Slayer", "Anime"));
		list.add(new Movie("Uncharted ", "Action"));
		list.add(new Movie("Spiderman", "Action"));
		list.add(new Movie("1917", "Drama"));
		list.add(new Movie("Johnny English", "Comedy"));
		list.add(new Movie("Don't Look Up", "Comedy"));
		list.add(new Movie("Howl's Moving Castle", "Anime"));
		list.add(new Movie("The Batman ", "Action"));
		list.add(new Movie("American Gangster", "Drama"));

		for (Movie movieTitle : list) {
			if (!genres.contains(movieTitle.getCategory()))
				genres.add(movieTitle.getCategory());
		}

		System.out.println("Please choose a movie genre (Anime, Action, Comedy, or Drama)");
		do {
			String genre = scanner.nextLine().toLowerCase();

			if (genres.contains(genre)) {
				cont = false;
				for (Movie movieTitle : list) {
					if (movieTitle.getCategory().equals(genre)) {
						System.out.println(movieTitle.getTitle());
					}
				}
			} else {
				System.out.println("Try again, enter a valid genre (Anime, Action, Comedy, or Drama)");
			}

		} while (cont);
		scanner.close();
	}
}
