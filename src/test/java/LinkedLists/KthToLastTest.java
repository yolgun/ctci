package LinkedLists;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.Assert.*;

public class KthToLastTest {
    private KthToLast<Integer> sut = new KthToLast<>();

    @Test
    public void apply() throws Exception {
        UniNode<Integer> list = UniNode.of(0);
        assertEquals(Optional.of(0), sut.apply(list, 0));

        list.addLast(1);
        assertEquals(Optional.of(0), sut.apply(list, 1));

        list.addLast(2);
        assertEquals(Optional.of(1), sut.apply(list, 1));
    }

    @Test
    public void shouldThrowNseeWhenNull() {
        UniNode<Integer> list = null;
        assertEquals(Optional.empty(), sut.apply(null, 1));

    }

    @Test
    public void shouldThrowNseeWhenKGreater() {
        UniNode<Integer> list = UniNode.of(0);
        assertEquals(Optional.empty(), sut.apply(list, 1));

    }
}