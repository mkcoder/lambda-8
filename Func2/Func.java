package Func2;

@FunctionalInterface
public interface Func<TIn1, TIn2, TOutResult>
{
    TOutResult Func(TIn1 tIn1, TIn2 tIn2);
}
