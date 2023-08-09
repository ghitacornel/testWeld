package beans.factory;

import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;

public class FactoryTest extends Setup {

    @Test
    public void testFactory() {

        Factory bean = container.select(Factory.class).get();
        Assert.assertNotNull(bean);

    }

    @Test
    public void testProduceSingleton() {

        SingletonProduct bean1 = container.select(SingletonProduct.class).get();
        Assert.assertNotNull(bean1);
        Assert.assertNotNull(bean1.component);
        Assert.assertFalse(bean1.postConstruct);
        Assert.assertFalse(bean1.preDestroy);
        Assert.assertFalse(bean1.destroyInvoked);

        SingletonProduct bean2 = container.select(SingletonProduct.class).get();
        Assert.assertNotNull(bean2);
        Assert.assertNotNull(bean2.component);
        Assert.assertFalse(bean2.postConstruct);
        Assert.assertFalse(bean2.preDestroy);
        Assert.assertFalse(bean2.destroyInvoked);

        Assert.assertSame(bean1, bean2);

        shutdown();

        Assert.assertFalse(bean1.postConstruct);
        Assert.assertFalse(bean1.preDestroy);
        Assert.assertTrue(bean1.destroyInvoked);
    }

    @Test
    public void testProducePrototype() {

        PrototypeProduct bean1 = container.select(PrototypeProduct.class).get();
        Assert.assertNotNull(bean1);
        Assert.assertFalse(bean1.postConstruct);
        Assert.assertFalse(bean1.preDestroy);
        Assert.assertFalse(bean1.destroyInvoked);
        Assert.assertNotNull(bean1.component);

        PrototypeProduct bean2 = container.select(PrototypeProduct.class).get();
        Assert.assertNotNull(bean2);
        Assert.assertFalse(bean2.postConstruct);
        Assert.assertFalse(bean2.preDestroy);
        Assert.assertFalse(bean2.destroyInvoked);
        Assert.assertNotNull(bean2.component);

        Assert.assertNotSame(bean1, bean2);
        Assert.assertNotSame(bean1.component, bean2.component);

        shutdown();

        Assert.assertFalse(bean1.postConstruct);
        Assert.assertFalse(bean1.preDestroy);
        Assert.assertTrue(bean1.destroyInvoked);
        Assert.assertFalse(bean2.postConstruct);
        Assert.assertFalse(bean2.preDestroy);
        Assert.assertTrue(bean2.destroyInvoked);
    }

}
