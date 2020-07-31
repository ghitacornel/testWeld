package beans.injection.alternatives;

import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;

public class TestAlternatives extends Setup {

    @Test
    public void testAlternative() {

        InjectionTarget bean = container.select(InjectionTarget.class).get();

        Assert.assertEquals(8, bean.f(2));

    }

}
