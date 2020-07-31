package beans.aop.interceptors;

import javax.interceptor.InterceptorBinding;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@InterceptorBinding
@Retention(RUNTIME)
public @interface InterceptorMarker {
}
