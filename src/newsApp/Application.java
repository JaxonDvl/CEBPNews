package newsApp;

import eventDispatcher.EventService;
import java.util.Date;
public class Application {

	public static void main(String[] args) {
		SportEventSubscriber sport1=new SportEventSubscriber("Gica Hagi",new SportPriceFilter());
		MusicEventSubscriber music1=new MusicEventSubscriber("Lica Samadau");
		MusicEventSubscriber music2 = new MusicEventSubscriber("Ghita Ciobanu",new MusicTownFilter("Iasi"));
		
		EventService.instance().Publish(new MusicEvent("Rockstadt","John",new Date(),"Timisoara","metal",155));
		EventService.instance().Publish(new MusicEvent("Wacken","Mike",new Date(),"Craiova","rock",120));
		EventService.instance().Publish(new MusicEvent("Plai","Elon",new Date(),"Iasi","folk",200));
		EventService.instance().Publish(new MusicEvent("Untold","Daiana",new Date(),"Cluj","pop",300));

		EventService.instance().Publish(new SportEvent("Cluj","Poli-UTA",new Date(),50));
		EventService.instance().Publish(new SportEvent("Timisoara","Steaua-Dinamo",new Date(),2000));


	}

}
