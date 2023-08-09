package beans.aop.interceptors;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

// must be @Dependent
// @Dependent is by default
// must be specified in beans.xml
@Interceptor
@InterceptorMarker
public class CustomInterceptor {

    @AroundInvoke
    public Object interceptMethod(InvocationContext invocationContext) throws Exception {

        System.out.println("Entering method: "
                + invocationContext.getMethod().getName() + " in class "
                + invocationContext.getMethod().getDeclaringClass().getName());

        if (invocationContext.getMethod().getName().equals("doSomething")) {
            InterceptorTarget target = (InterceptorTarget) invocationContext.getTarget();
            target.doSomethingChecked = true;
        }
        if (invocationContext.getMethod().getName().equals("f")) {
            InterceptorTarget target = (InterceptorTarget) invocationContext.getTarget();
            target.fChecked = true;
        }

        return invocationContext.proceed();
    }
}
