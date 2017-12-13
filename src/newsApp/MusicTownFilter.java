package newsApp;
import eventDispatcher.Event;
import eventDispatcher.Filter;

public class MusicTownFilter implements Filter{
	private String oras;
	public MusicTownFilter(String oras)
	{
		this.oras=oras;
	}

	public boolean Apply(Event event) {
		MusicEvent musicEvent=(MusicEvent) event;
		if(musicEvent.getCity()!=this.oras)
			return false;
		return true;
	}
}
