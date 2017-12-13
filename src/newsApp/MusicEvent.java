package newsApp;
import eventDispatcher.Event;

import java.util.Date;

public class MusicEvent implements Event { 
	private String title;
	private String artist;
	private Date date;
	private String city;
	private String genre;
	private int price;


	public MusicEvent(String title, String artist, Date date, String city, String genre, int price) {
		this.title = title;
		this.artist = artist;
		this.date = date;
		this.city = city;
		this.genre = genre;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public Date getDate() {
		return date;
	}

	public String getCity() {
		return city;
	}

	public String getGenre() {
		return genre;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "MusicEvent{" +
				"title='" + title + '\'' +
				", artist='" + artist + '\'' +
				", date=" + date +
				", city='" + city + '\'' +
				", genre='" + genre + '\'' +
				", price=" + price +
				'}';
	}
}