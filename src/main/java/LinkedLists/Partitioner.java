package LinkedLists;

import java.util.function.BiFunction;

/**
 * CtCI 1.4
 */
public class Partitioner<T extends Comparable> implements BiFunction<UniNode<T>, T, UniNode<T>> {
    @Override
    public UniNode<T> apply(UniNode<T> head, T k) {
        UniNode<T> lessOrEqualBeg = null;
        UniNode<T> lessOrEqualEnd = null;
        UniNode<T> greaterBeg = null;
        UniNode<T> greaterEnd = null;
        while (head != null) {
            if (head.data.compareTo(k) <= 0) {
                if (lessOrEqualEnd == null) {
                    lessOrEqualBeg = head;
                    lessOrEqualEnd = head;
                } else {
                    lessOrEqualEnd.next = head;
                    lessOrEqualEnd = head;
                }
            } else {
                if (greaterEnd == null) {
                    greaterBeg = head;
                    greaterEnd = head;
                } else {
                    greaterEnd.next = head;
                    greaterEnd = head;
                }
            }
            head = head.next;
        }
        if (lessOrEqualEnd == null) {
            return greaterBeg;
        }
        lessOrEqualEnd.next = greaterBeg;
        return lessOrEqualBeg;
    }
}
