package beans.injection.qualifier;

import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;

public class InjectionTest extends Setup {

    @Test
    public void testInjection() {

        QualifierInjectionTarget bean = container.select(QualifierInjectionTarget.class).get();
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.getComponent1());
        Assert.assertSame(QualifierComponentImplementation1.class, bean.getComponent1().getClass());
        Assert.assertNotNull(bean.getComponent2());
        Assert.assertSame(QualifierComponentImplementation2.class, bean.getComponent2().getClass());

    }

}
