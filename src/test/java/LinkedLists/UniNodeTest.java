package LinkedLists;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniNodeTest {
    @Test
    public void shouldAppend() throws Exception {
        UniNode<Integer> sut = new UniNode<>(0);

        sut.addLast(1);
        assertEquals(Integer.valueOf(1), sut.last().data);

        sut.addLast(2);
        assertEquals(Integer.valueOf(2), sut.last().data);
    }

    @Test
    public void shouldRemoveAndBeEmpty() throws Exception {
        UniNode<Integer> sut = new UniNode<>(0);

        sut = sut.removeFirst(0);
        assertEquals(null, sut);
    }

    @Test
    public void shouldRemoveHead() throws Exception {
        UniNode<Integer> sut = new UniNode<>(0);
        sut.addLast(1);

        sut = sut.removeFirst(0);
        assertEquals(Integer.valueOf(1), sut.data);
    }

    @Test
    public void shouldRemoveCorrect() throws Exception {
        UniNode<Integer> sut = new UniNode<>(0);
        sut.addLast(1)
                .addLast(2);

        sut = sut.removeFirst(2);
        assertEquals(Integer.valueOf(0), sut.data);
        assertEquals(Integer.valueOf(1), sut.next.data);

        sut = sut.removeFirst(3);
        assertEquals(Integer.valueOf(0), sut.data);
        assertEquals(Integer.valueOf(1), sut.next.data);
    }

    @Test
    public void shouldRemoveNext() throws Exception {
        UniNode<Integer> sut = UniNode.of(0, 1, 2);

        sut.removeNext();
        assertEquals(Integer.valueOf(0), sut.data);
        assertEquals(Integer.valueOf(2), sut.next.data);
    }
}