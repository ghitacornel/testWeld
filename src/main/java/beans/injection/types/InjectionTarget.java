package beans.injection.types;


import jakarta.inject.Inject;

public class InjectionTarget {

    @Inject
    private FieldComponent fieldComponent;

    private SetterComponent setterComponent;

    private ConstructorComponent constructorComponent;

    @Inject
    public InjectionTarget(ConstructorComponent constructorComponent) {
        this.constructorComponent = constructorComponent;
    }

    @Inject
    public void setSetterComponent(SetterComponent setterComponent) {
        this.setterComponent = setterComponent;
    }

    public FieldComponent getFieldComponent() {
        return fieldComponent;
    }

    public SetterComponent getSetterComponent() {
        return setterComponent;
    }

    public ConstructorComponent getConstructorComponent() {
        return constructorComponent;
    }
}
