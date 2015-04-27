import Action.Action;
import Func5.Func;
import LinqList.LinqList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//	    Runnable r = () -> {
//            System.out.println("Working in a thread!");
//            try {
//                Thread.sleep(8000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        };
//
//        Thread t = new Thread(r);
//        t.setPriority(5);
//        t.run();
//
//        Func<Integer, Integer, Integer, Integer, Integer, String> f = (x,y,z,a,b) -> {
//            return String.format("%s", x+y+a+b+z);
//        };
//
//        System.out.println(f.Func(1, 2, 3, 4, 5));

        Action<Integer> printAction = (x) -> {
            System.out.println(x);
        };

        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < 20; i++ ) {
            l.add(i);
        }
        LinqList<Integer> ll = new LinqList<Integer>(l);

        ll.selectAll(printAction);
        System.out.println();

        ll = ll.select( (x) -> {
            if ( x % 2==0 ) {
                return true;
            }
            return false;
        });

        ll.selectAll(printAction);
        System.out.println();

        ll = ll.where( (x) -> {
            return true;
        });

    }
}
