package beans.aop.decorators;

import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;

public class AOPTest extends Setup {

    @Test
    public void testIntercept() {

        InjectionTarget target = container.select(InjectionTarget.class).get();
        Assert.assertNotNull(target);

        Assert.assertEquals(16, target.f(2));

    }

}
