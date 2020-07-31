package beans.injection.types;

import beans.injection.types.InjectionTarget;
import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;

public class TestInjection extends Setup {

    @Test
    public void testInjection() {

        InjectionTarget bean = container.select(InjectionTarget.class).get();
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.getConstructorComponent());
        Assert.assertNotNull(bean.getFieldComponent());
        Assert.assertNotNull(bean.getSetterComponent());

    }

}
