package beans.injection.alternatives;

import javax.enterprise.inject.Alternative;

// excluded from injection unless specified as alternative in beans.xml
@Alternative
public class Service2 implements Service {

    @Override
    public int f(int x) {
        return x * x * x;
    }

}
