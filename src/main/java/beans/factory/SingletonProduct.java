package beans.factory;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.inject.Alternative;

@Alternative// force usage of Producer
public class SingletonProduct {

    public SingletonProductComponent component;
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
