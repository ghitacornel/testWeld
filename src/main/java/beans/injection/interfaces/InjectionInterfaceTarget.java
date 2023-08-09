package beans.injection.interfaces;


import jakarta.inject.Inject;

public class InjectionInterfaceTarget {

    @Inject
    private InjectionInterface injectionInterface;

    public InjectionInterface getInjectionInterface() {
        return injectionInterface;
    }
}
