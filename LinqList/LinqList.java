package LinqList;

import Action.Action;
import Func.Func;
import java.util.ArrayList;
import java.util.List;

/***
 * @Author Muhammad K. Khan
 * @Bio
 * */
public class LinqList<T>
{
    List<T> list;

    public List<T> getList() {
        return list;
    }

    public LinqList(List<T> list)
    {
        this.list = list;
    }

    public LinqList<T> select(Func<T, Boolean> predicate) {
        ArrayList<T> results = new ArrayList<>();
        for ( T item : list )
        {
            if ( predicate.Func( item ) ) {
                results.add(item);
            }
        }
        return new LinqList<T>(results);
    }

    public List<T> selectAll() {
        return list;
    }

    public void selectAll(Action<T> action) {
        for (T t : list ) action.Action(t);
    }

    public LinqList<T> where(Func<T, Boolean> predicate) {
        ArrayList<T> results = new ArrayList<>();
        for ( T item : list )
        {
            if ( predicate.Func( item ) ) {
                results.add(item);
            }
        }
        return new LinqList<T>(results);
    }

    public void forEach(Action<T> action)
    {
        
    }
}
