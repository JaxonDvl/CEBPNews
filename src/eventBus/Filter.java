package eventBus;

public interface Filter {

	boolean Apply(Event event);
}
