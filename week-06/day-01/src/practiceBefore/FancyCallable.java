package practiceBefore;

public interface FancyCallable<V,P> {
    V call0() throws Exception;
    V call1(P p) throws Exception;
    V call2(P p1, P p2) throws Exception;
}
