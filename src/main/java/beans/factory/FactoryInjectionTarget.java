package beans.factory;


import jakarta.inject.Inject;

public class FactoryInjectionTarget {

    @Inject
    public PrototypeProduct prototypeProduct;

    @Inject
    public SingletonProduct singletonProduct;

}
