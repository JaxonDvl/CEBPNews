package newsApp;
import eventDispatcher.Event;

import eventDispatcher.EventService;
import eventDispatcher.Filter;
import eventDispatcher.Subscriber;

public class SportEventSubscriber extends Subscriber {
	private String name;
	
	public SportEventSubscriber(String subscriberName)
	{
		this.name=subscriberName;
		EventService.instance().subscribe(SportEvent.class,null,this);
	}
	
	public SportEventSubscriber(String subscriberName, Filter filter)
	{
		this.name=subscriberName;
		EventService.instance().subscribe(SportEvent.class,filter,this);
	}
	
	@Override
	public void inform(Event event) {
		SportEvent sportEvent =(SportEvent) event;
		 System.out.println(this.name+": sport event notification : " + sportEvent);
	}

}
