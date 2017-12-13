package newsApp;
import eventBus.Event;
import eventBus.Filter;

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
