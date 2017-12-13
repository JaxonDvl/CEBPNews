package newsApp;
import eventBus.Event;
import eventBus.Filter;

public class MusicGenreFilter implements Filter{
	private String gen;
	public MusicGenreFilter(String gen)
	{
		this.gen=gen;
	}
	public boolean Apply(Event event) {
		MusicEvent musicEvent=(MusicEvent) event;
		if(musicEvent.getGenre()==this.gen)
			return false;
		return true;
	}
}
