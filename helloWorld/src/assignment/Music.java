package assignment;

public class Music {
	private String[] name = new String[3];
	public String[] song = new String[3];
	int t = 0;
	
	String getName(int i){
		return name[i];
	}
	
	String getSong(int i) {
		return song[i];
	}
	
	void setName(String name) {
		this.name[t] = name;
	}
	
	void setSong(String song) {
		this.song[t] = song;
	}
	
	void set(String name, String song) {
		setName(name);
		setSong(song);
	}
	
	void printPlaydata() {
		for(int i = 0; i < 3; i++) {
			System.out.println(getSong(i) + " of " + getName(i));
		}
	}
}
