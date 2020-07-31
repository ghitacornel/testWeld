package beans.injection.named;

import javax.inject.Inject;
import javax.inject.Named;

public class NamedInjectionTarget {

    @Inject
    @Named("c1")
    private NamedComponent component1;

    @Inject
    @Named("c2")
    private NamedComponent component2;

    public NamedComponent getComponent1() {
        return component1;
    }

    public NamedComponent getComponent2() {
        return component2;
    }
}
