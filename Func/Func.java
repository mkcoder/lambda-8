package Func;

@FunctionalInterface
public interface Func<TIn1, TOutResult>
{
    TOutResult Func(TIn1 tIn1);
}
