package beans.injection.alternatives;

import javax.inject.Inject;

public class InjectionTarget {

    @Inject
    private Service service;

    public int f(int x) {
        return service.f(x);
    }


}
