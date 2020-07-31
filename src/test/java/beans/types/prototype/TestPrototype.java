package beans.types.prototype;

import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;

public class TestPrototype extends Setup {

    @Test
    public void testPrototype() {

        MyPrototype bean1 = container.select(MyPrototype.class).get();
        Assert.assertNotNull(bean1);

        MyPrototype bean2 = container.select(MyPrototype.class).get();
        Assert.assertNotNull(bean2);

        Assert.assertNotSame(bean1, bean2);

    }

}
