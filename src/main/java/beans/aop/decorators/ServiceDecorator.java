package beans.aop.decorators;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class ServiceDecorator implements Decorable {

    @Inject
    @Delegate
    Decorable decorable;

    @Override
    public int f(int x) {
        return x * decorable.f(x);
    }

}
