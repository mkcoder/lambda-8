package Func3;

@FunctionalInterface
public interface Func<TIn1, TIn2, TIn3, TOutResult>
{
    TOutResult Func(TIn1 tIn1, TIn2 tIn2, TIn3 tIn3);
}
