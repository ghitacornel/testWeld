package beans.aop.interceptors;

@InterceptorMarker
public class InterceptorTarget {

    public boolean doSomethingChecked = false;
    public boolean fChecked = false;

    public void doSomething() {
        System.out.println("OK");
    }

    public int f(int x) {
        return x * x;
    }

}
