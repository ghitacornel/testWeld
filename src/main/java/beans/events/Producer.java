package beans.events;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class Producer {

    @Inject
    Event<String> event;

    public void fireEvent() {
        event.fire("custom message");
    }

}
