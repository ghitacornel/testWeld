package beans.types.application;

import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;

public class TestApplication extends Setup {

    @Test
    public void testSingleton() {

        MyApplication bean1 = container.select(MyApplication.class).get();
        Assert.assertNotNull(bean1);

        MyApplication bean2 = container.select(MyApplication.class).get();
        Assert.assertNotNull(bean2);

        Assert.assertSame(bean1, bean2);

    }

}
