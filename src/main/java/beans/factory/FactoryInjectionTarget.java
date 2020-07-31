package beans.factory;

import javax.inject.Inject;

public class FactoryInjectionTarget {

    @Inject
    public PrototypeProduct prototypeProduct;

    @Inject
    public SingletonProduct singletonProduct;

}
