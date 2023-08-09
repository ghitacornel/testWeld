package tests.setup;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.After;
import org.junit.Before;


public abstract class Setup {

    // use it for programmatic control of containers creation
    private static final Weld weld = new Weld();

    protected WeldContainer container;

    @Before
    public void setUpContainer() {
        container = weld.initialize();
    }

    @After
    public void tearDownContainer() {
        if (container != null && container.isRunning())
            container.shutdown();
    }

}
