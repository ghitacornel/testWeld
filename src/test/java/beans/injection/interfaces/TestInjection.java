package beans.injection.interfaces;

import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;

public class TestInjection extends Setup {

    @Test
    public void testInjection() {

        InjectionInterfaceTarget bean = container.select(InjectionInterfaceTarget.class).get();
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.getInjectionInterface());

    }

}
