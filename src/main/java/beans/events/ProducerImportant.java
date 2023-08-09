package beans.events;


import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;

public class ProducerImportant {

    @Inject
    @EventMarkerImportant
    Event<String> event;

    public void fireEvent() {
        event.fire("custom marked message");
    }

}
