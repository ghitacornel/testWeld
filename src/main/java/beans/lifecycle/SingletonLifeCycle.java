package beans.lifecycle;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Singleton;

@Singleton
public class SingletonLifeCycle {

    public boolean init = false;
    public boolean destroy = false;

    @PostConstruct
    public void init() {
        init = true;
    }

    @PreDestroy
    public void destroy() {
        destroy = true;
    }

}
