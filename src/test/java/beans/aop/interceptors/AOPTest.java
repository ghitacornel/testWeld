package beans.aop.interceptors;

import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;

public class AOPTest extends Setup {

    @Test
    public void testIntercept() {

        InterceptorTarget target = container.select(InterceptorTarget.class).get();
        Assert.assertNotNull(target);
        Assert.assertFalse(target.doSomethingChecked);
        Assert.assertFalse(target.fChecked);

        target.doSomething();
        target.f(3);

        Assert.assertTrue(target.doSomethingChecked);
        Assert.assertTrue(target.fChecked);

    }

}
