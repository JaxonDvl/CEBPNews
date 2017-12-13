package eventDispatcher;

import java.util.ArrayList;
import java.util.List;

public class EventService {

	private static EventService _instance;
	protected List<Subscription> subscriptions;
	private EventService()
	{
		subscriptions=new ArrayList<Subscription>();
	}

	public static EventService instance()
	{
		if(_instance==null)
			_instance=new EventService();
		return _instance;
	}

	public void Publish(Event e)
	{
		for(Subscription record : subscriptions)
			if(record.getEventType().isAssignableFrom(e.getClass())&&(record.getFilter()==null||record.getFilter().Apply(e)))
				record.getSubscriber().inform(e);
	}
	public void subscribe(Class eventType,Filter filter, Subscriber subscriber )
	{
		if(Event.class.isAssignableFrom(eventType))
		{
			Subscription _record=new Subscription(eventType,filter,subscriber);
			if(!subscriptions.contains(_record))
				subscriptions.add(_record);
		}
	}
	public void unsubscribe(Class eventType, Filter filter, Subscriber subscriber)
	{
		if(Event.class.isAssignableFrom(eventType))
			subscriptions.remove(new Subscription(eventType,filter,subscriber));
	}
}
