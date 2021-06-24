package _05_netflix;

public class Runner {
	public static void main(String[] args) {
		Movie Marvel = new Movie("Endgame", 94);
		Movie DC = new Movie("Justice League", 71);
		Movie KG = new Movie("Demon Slayer", 97);
		Movie Disney = new Movie("Cruella", 74);
		Movie Pixar = new Movie("Luca", 89);
		
		KG.getTicketPrice();
		
		NetflixQueue net = new NetflixQueue();
		net.addMovie(Pixar);
		net.addMovie(Disney);
		net.addMovie(KG);
		net.addMovie(DC);
		net.addMovie(Marvel);
		
		net.printMovies();
		
		System.out.println("The best movie is " + net.getBestMovie());
		System.out.println("The second best movie is " + net.getMovie(1));
	}
}
