package beans.injection.specializes;

import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;

public class TestSpecializes extends Setup {

    @Test
    public void testSpecializes() {
        SpecializesInjectTarget bean = container.select(SpecializesInjectTarget.class).get();
        Assert.assertNotNull(bean);
        Assert.assertNotNull(bean.dependency);
        Assert.assertSame(SpecializedDependency.class, bean.dependency.getClass());
    }
}
