package beans.factory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.inject.Vetoed;

@Vetoed// force usage of Producer
public class PrototypeProduct {

    public PrototypeProductComponent component;
    public boolean createdByFactory = false;
    public boolean postConstruct = false;
    public boolean preDestroy = false;
    public boolean destroyInvoked = false;

    // ignored
    @PostConstruct
    public void setup() {
        postConstruct = true;
    }

    // ignored
    @PreDestroy
    public void tearDown() {
        preDestroy = true;
    }

}
