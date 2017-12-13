package newsApp;
import eventDispatcher.Event;
import eventDispatcher.Filter;


public class SportPriceFilter implements Filter{
	@Override
	public boolean Apply(Event event) {
		SportEvent sportEvent =(SportEvent) event;
		if(sportEvent.getPrice()>1000)
			return false;
		return true;
	}
}
