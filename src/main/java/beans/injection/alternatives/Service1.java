package beans.injection.alternatives;

public class Service1 implements Service {

    @Override
    public int f(int x) {
        return x * x;
    }

}
