package beans.injection.named;

import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;

public class InjectionTest extends Setup {

    @Test
    public void testInjection() {

        NamedInjectionTarget bean = container.select(NamedInjectionTarget.class).get();
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.getComponent1());
        Assert.assertSame(NamedComponentImplementation1.class, bean.getComponent1().getClass());
        Assert.assertNotNull(bean.getComponent2());
        Assert.assertSame(NamedComponentImplementation2.class, bean.getComponent2().getClass());

    }

}
