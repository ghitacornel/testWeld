package beans.aop.decorators;

import javax.inject.Inject;

public class InjectionTarget {

    @Inject
    private Decorable decorable;

    public int f(int x) {
        return x * decorable.f(x);
    }

}
