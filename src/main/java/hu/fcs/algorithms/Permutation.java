package hu.fcs.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public <T> List<List<T>> of(List<T> list) {
        List<List<T>> result = new ArrayList<>();
        if (list.size() == 1) {
            result.add(list);
        } else if (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                List<T> nextList = new ArrayList<>(list);
                T x = nextList.remove(i);
                List<List<T>> nextResult = of(nextList);
                for (List<T> nextSubResult : nextResult) {
                    nextSubResult.add(0, x);
                }
                result.addAll(nextResult);
            }
        }
        return result;
    }
}
