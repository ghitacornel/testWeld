package beans.injection.alternatives;


import jakarta.inject.Inject;

public class InjectionTarget {

    @Inject
    private Service service;

    public int f(int x) {
        return service.f(x);
    }


}
