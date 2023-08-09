package beans.lifecycle;

import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;

public class TestLifeCycle extends Setup {

    @Test
    public void testSingletonLifeCycle() {

        SingletonLifeCycle bean = container.select(SingletonLifeCycle.class).get();
        shutdown();

        Assert.assertTrue(bean.init);
        Assert.assertTrue(bean.destroy);
    }

    @Test
    public void testPrototypeLifeCycle() {

        PrototypeLifeCycle bean = container.select(PrototypeLifeCycle.class).get();
        shutdown();

        Assert.assertTrue(bean.init);
        Assert.assertTrue(bean.destroy);
    }
}
