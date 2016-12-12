package LinkedLists;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.BiFunction;

/**
 * CtCI 2.2
 */
public class KthToLast<T> implements BiFunction<UniNode<T>, Integer, Optional<T>> {

    @Override
    public Optional<T> apply(UniNode<T> head, Integer k) {
        if (head == null) {
            return Optional.empty();
        }
        UniNode<T> forward = head;
        for (int i = 0; i < k; i++) {
            forward = forward.next;
            if (forward == null) {
                return Optional.empty();
            }
        }
        while (forward.next != null) {
            forward = forward.next;
            head = head.next;
        }
        return Optional.of(head.data);
    }
}
