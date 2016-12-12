package LinkedLists;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateRemoverTest {
    private final DuplicateRemover<Integer> sut = new DuplicateRemover<>();

    @Test
    public void shouldRemoveNothing() throws Exception {
        UniNode<Integer> list = UniNode.of(0, 1, 2);

        sut.accept(list);
        assertEquals(Integer.valueOf(0), list.data);
        assertEquals(Integer.valueOf(1), list.next.data);
        assertEquals(Integer.valueOf(2), list.next.next.data);
        assertEquals(null, list.next.next.next);

        list.addLast(2);
        list.addLast(2);
        sut.accept(list);
        assertEquals(Integer.valueOf(0), list.data);
        assertEquals(Integer.valueOf(1), list.next.data);
        assertEquals(Integer.valueOf(2), list.next.next.data);
        assertEquals(null, list.next.next.next);
    }

}