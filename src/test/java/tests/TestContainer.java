package tests;

import jakarta.enterprise.inject.spi.CDI;
import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;


public class TestContainer extends Setup {

    @Test
    public void testContainerIsRunning() {
        Assert.assertNotNull(container);
        Assert.assertSame(container, CDI.current());
        // test container is started and stopped
    }

}
