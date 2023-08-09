package beans.factory;


import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Singleton;

public class Factory {

    @Produces
    public PrototypeProduct createPrototypeProduct(PrototypeProductComponent component) {
        PrototypeProduct product = new PrototypeProduct();
        product.createdByFactory = true;
        product.component = component;
        return product;
    }

    @Produces
    @Singleton
    public SingletonProduct singletonProduct(SingletonProductComponent component) {
        SingletonProduct product = new SingletonProduct();
        product.createdByFactory = true;
        product.component = component;
        return product;
    }

    // invoked on destruction
    public void destroy(@Disposes PrototypeProduct product) {
        product.destroyInvoked = true;
    }

    // invoked on destruction
    public void destroy(@Disposes SingletonProduct product) {
        product.destroyInvoked = true;
    }

}
