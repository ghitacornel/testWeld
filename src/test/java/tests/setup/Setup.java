package tests.setup;

import jakarta.enterprise.inject.spi.CDI;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.After;
import org.junit.Before;


public abstract class Setup {

    // use it for programmatic control of containers creation
    private static final Weld weld = new Weld();

    protected CDI<Object> container;

    @Before
    public void setUpContainer() {
        container = weld.initialize();
    }

    @After
    public void tearDownContainer() {
        if (container != null) {
            WeldContainer weldContainer = (WeldContainer) container;
            if (weldContainer.isRunning()) {
                weldContainer.shutdown();
            }
        }
    }

    // utility for shutting down the container
    protected void shutdown() {
        WeldContainer weldContainer = (WeldContainer) container;
        weldContainer.shutdown();
    }

}
