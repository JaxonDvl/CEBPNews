package newsApp;
import eventDispatcher.Event;
import eventDispatcher.EventService;
import eventDispatcher.Filter;
import eventDispatcher.Subscriber;

public class MusicEventSubscriber extends Subscriber {
	
	private String name;
	
	public MusicEventSubscriber(String subscriberName)
	{
		this.name=subscriberName;
		EventService.instance().subscribe(MusicEvent.class,null, this);
	}
	
	public MusicEventSubscriber(String subscriberName,Filter filter)
	{
		this.name=subscriberName;
		EventService.instance().subscribe(MusicEvent.class,filter, this);
	}
	public void unsubscribe(){
//		EventService.instance().unsubscribe();
	//todo implement this
	}
	@Override
	public void inform(Event event) {
		MusicEvent musicEvent=(MusicEvent) event;

		System.out.println(this.name+": music event notification: " + musicEvent);

	}

}
