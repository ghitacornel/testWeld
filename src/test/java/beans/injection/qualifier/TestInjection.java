package beans.injection.qualifier;

import beans.injection.named.NamedComponentImplementation1;
import beans.injection.named.NamedComponentImplementation2;
import beans.injection.named.NamedInjectionTarget;
import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;

public class TestInjection extends Setup {

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
