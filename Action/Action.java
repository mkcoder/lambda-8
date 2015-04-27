package Action;

@FunctionalInterface
public interface Action<T1>
{
    public void  Action(T1 t1);
/**
    public <T1,T2> void  Action(T1 t1, T2 t2);
    public <T1,T2,T3> void  Action(T1 t1, T2 t2, T3 t3);
    public <T1,T2,T3,T4> void  Action(T1 t1, T2 t2, T3 t3, T4 t4);
**/
}
