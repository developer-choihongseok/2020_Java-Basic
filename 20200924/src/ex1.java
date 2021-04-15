class Song{
	
	int year;
	String country, artist, title;
	
	Song(){
		
	}
	
	Song(int y, String c, String a, String t){
		this.year = y;
		this.country = c;
		this.artist = a;
		this.title = t;
	}
	
	void show(){
		System.out.print(year + "년 ");
		System.out.print(country + "국적의 ");
		System.out.print(artist + "이 부른 ");
		System.out.print(title);
	}
}

public class ex1 {
	public static void main(String[] args) {
		
		Song song = new Song(1975, "영국", "QUEEN", "Bohemian Rhapsody");
		song.show();
	}
}