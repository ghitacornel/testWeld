package beans.aop.decorators;


import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.inject.Inject;

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
