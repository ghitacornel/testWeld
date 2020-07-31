package beans.injection.qualifier;

import javax.inject.Inject;
import javax.inject.Named;

public class QualifierInjectionTarget {

    @Inject
    @Mark1
    private QualifierComponent component1;

    @Inject
    @Mark2
    private QualifierComponent component2;

    public QualifierComponent getComponent1() {
        return component1;
    }

    public QualifierComponent getComponent2() {
        return component2;
    }

}
