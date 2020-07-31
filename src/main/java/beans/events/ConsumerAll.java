package beans.events;

import javax.enterprise.event.Observes;
import javax.inject.Singleton;

@Singleton
public class ConsumerAll {

    public int count = 0;

    public void consumeEvent(@Observes String message) {
        count++;
    }

}
