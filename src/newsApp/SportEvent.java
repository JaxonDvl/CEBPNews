package newsApp;

import java.util.Date;

import eventBus.Event;

public class SportEvent implements Event {
	  
	private String location;
	private String teams;
	private Date date;
	private int price;


	public SportEvent(String location, String teams, Date date, int price) {
		this.location = location;
		this.teams = teams;
		this.date = date;
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public String getTeams() {
		return teams;
	}

	public Date getDate() {
		return date;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "SportEvent{" +
				"location='" + location + '\'' +
				", teams='" + teams + '\'' +
				", date=" + date +
				", price=" + price +
				'}';
	}
}
