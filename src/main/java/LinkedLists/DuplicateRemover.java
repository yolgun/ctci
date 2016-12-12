package LinkedLists;

import java.util.HashSet;
import java.util.function.Consumer;

/**
 * CtCI 2.1
 */
public class DuplicateRemover<T> implements Consumer<UniNode<T>> {
    @Override
    public void accept(UniNode<T> head) {
        HashSet<T> exists = new HashSet<>();

        UniNode<T> previous = head;
        while (head != null) {
            if (exists.contains(head.data)) {
                previous.next = head.next;
            } else {
                exists.add(head.data);
                previous = head;
            }
            head = head.next;
        }
    }
}
