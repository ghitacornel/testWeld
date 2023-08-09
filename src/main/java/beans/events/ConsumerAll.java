package beans.events;


import jakarta.enterprise.event.Observes;
import jakarta.inject.Singleton;

@Singleton
public class ConsumerAll {

    public int count = 0;

    public void consumeEvent(@Observes String message) {
        count++;
    }

}
