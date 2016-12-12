package LinkedLists;

/**
 * Node of a linked list.
 */
public class UniNode<T> {
    public T data;
    public UniNode<T> next;

    public UniNode(T data) {
        this(data, null);
    }

    public UniNode(T data, UniNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public UniNode<T> addLast(T newData) {
        if (isLast()) {
            return next = new UniNode<>(newData);
        }
        return last().addLast(newData);
    }

    private boolean isLast() {
        return next == null;
    }

    public UniNode<T> last() {
        UniNode<T> tmp = this;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp;
    }

    public UniNode<T> removeFirst(T data) {
        if (this.data == data)
            return this.next;

        UniNode<T> n = this;
        while (n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
                return this;
            }
            n = n.next;
        }
        return this;
    }

    public void removeNext() {
        if (next != null) {
            next = next.next;
        }
    }

    public static <T> UniNode<T> of(T... data) {
        UniNode<T> head = new UniNode<>(data[0]);
        UniNode<T> tmp = head;
        for (int i = 1; i < data.length; i++) {
            tmp = tmp.addLast(data[i]);
        }
        return head;
    }
}
