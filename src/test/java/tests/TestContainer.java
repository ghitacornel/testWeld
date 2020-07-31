package tests;

import org.junit.Assert;
import org.junit.Test;
import tests.setup.Setup;

import javax.enterprise.inject.spi.CDI;

public class TestContainer extends Setup {

    @Test
    public void testContainerIsRunning() {
        Assert.assertTrue(container.isRunning());
        Assert.assertSame(container, CDI.current());
        // test container is started and stopped
    }

}
