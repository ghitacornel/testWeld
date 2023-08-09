package beans.events;


import jakarta.enterprise.event.Observes;
import jakarta.inject.Singleton;

@Singleton
public class ConsumerImportant {

    public int count = 0;

    public void consumeEvent(@Observes @EventMarkerImportant String message) {
        count++;
    }

}
