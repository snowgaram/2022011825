package assignment;

public class GenreMusic extends Music{
	private String[] genre = new String[3];
	int k = 0;
	
	String getGenre(int i, String[] song) {
		if(song[i].equals("Destiny")) {
			return genre[0];
		}
		else if(song[i].equals("Messiah")) {
			return genre[1];
		}
		else if(song[i].equals("FourSeasons")) {
			return genre[2];
		}
		return null;
	}
	
	void setGenre(String genre) {
		this.genre[k] = genre;
	}
	
	void printPlaydata() {
		for(int i = 0; i < 3; i++) {
			System.out.println(getSong(i) + " of " + getName(i));
			System.out.print(getSong(i) + " of " + getName(i));
			System.out.println("(" + getGenre(i,song) + ")");
		}
	}
}
