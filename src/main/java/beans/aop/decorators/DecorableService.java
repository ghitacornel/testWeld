package beans.aop.decorators;

public class DecorableService implements Decorable {

    @Override
    public int f(int x) {
        return x * x;
    }

}
