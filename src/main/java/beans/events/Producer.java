package beans.events;


import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;

public class Producer {

    @Inject
    Event<String> event;

    public void fireEvent() {
        event.fire("custom message");
    }

}
