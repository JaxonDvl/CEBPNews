package newsApp;
import eventDispatcher.Event;
import eventDispatcher.Filter;

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
