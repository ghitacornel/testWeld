package beans.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Singleton;

public class PrototypeLifeCycle {

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
