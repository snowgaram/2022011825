package assignment;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Music music = new GenreMusic();
		GenreMusic genremusic;
		genremusic = (GenreMusic) music;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Song: ");
			String song = sc.next();
			
			System.out.print("Genre: ");
			String genre = sc.next();
			
			music.set(name, song);
			genremusic.setGenre(genre);
			genremusic.k++;
			music.t++;
		}
		System.out.printf("\n");
		music.printPlaydata();
	}
}
