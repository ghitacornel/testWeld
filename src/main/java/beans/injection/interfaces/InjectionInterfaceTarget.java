package beans.injection.interfaces;

import javax.inject.Inject;

public class InjectionInterfaceTarget {

    @Inject
    private InjectionInterface injectionInterface;

    public InjectionInterface getInjectionInterface() {
        return injectionInterface;
    }
}
