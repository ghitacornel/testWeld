package beans.injection.specializes;


import jakarta.enterprise.inject.Specializes;

// total injection override
// can be placed in separate module
@Specializes
public class SpecializedDependency extends Dependency {

    // total or partial override of methods

}
