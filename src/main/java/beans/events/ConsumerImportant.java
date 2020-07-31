package beans.events;

import javax.enterprise.event.Observes;
import javax.inject.Singleton;

@Singleton
public class ConsumerImportant {

    public int count = 0;

    public void consumeEvent(@Observes @EventMarkerImportant String message) {
        count++;
    }

}
