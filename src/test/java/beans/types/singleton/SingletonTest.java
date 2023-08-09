package beans.types.singleton;

import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;

public class SingletonTest extends Setup {

    @Test
    public void testSingleton() {

        MySingleton bean1 = container.select(MySingleton.class).get();
        Assert.assertNotNull(bean1);

        MySingleton bean2 = container.select(MySingleton.class).get();
        Assert.assertNotNull(bean2);

        Assert.assertSame(bean1, bean2);

    }

}
