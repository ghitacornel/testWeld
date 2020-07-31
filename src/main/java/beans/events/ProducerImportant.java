package beans.events;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class ProducerImportant {

    @Inject
    @EventMarkerImportant
    Event<String> event;

    public void fireEvent() {
        event.fire("custom marked message");
    }

}
