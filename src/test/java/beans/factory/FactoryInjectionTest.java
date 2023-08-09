package beans.factory;

import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;

public class FactoryInjectionTest extends Setup {

    @Test
    public void testInjection() {

        FactoryInjectionTarget bean = container.select(FactoryInjectionTarget.class).get();
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.prototypeProduct);
        Assert.assertNotNull(bean.singletonProduct);

    }

}
