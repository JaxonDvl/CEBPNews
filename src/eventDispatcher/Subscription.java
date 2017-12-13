package eventDispatcher;

class Subscription {
  private Class eventType;
  private Filter filter;
  private Subscriber subscriber;

  public Subscription(Class eventType, Filter filter, Subscriber subscriber) {
    this.eventType = eventType;
    this.filter = filter;
    this.subscriber = subscriber;
  }


  public Class getEventType() {
    return eventType;
  }

  public Filter getFilter() {
    return filter;
  }

  public Subscriber getSubscriber() {
    return subscriber;
  }
}
