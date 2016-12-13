package LinkedLists;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by yunus on 13.12.16.
 */
public class PartitionerTest {
    private final Partitioner<Integer> sut = new Partitioner<>();

    @Test
    public void testSinglePartitioner() throws Exception {
        UniNode<Integer> list = UniNode.of(1);
        assertThat(sut.apply(list, 0), is(equalTo(UniNode.of(1))));
        assertThat(sut.apply(list, 2), is(equalTo(UniNode.of(1))));
    }

    @Test
    public void testMultiPartitioner() throws Exception {
        UniNode<Integer> list = UniNode.of(0,2,5,1,3,4);
        assertThat(sut.apply(list, 3), is(equalTo(UniNode.of(0,2,1,3,5,4))));
    }

    @Test
    public void testMultiEdgePartitioner() throws Exception {
        UniNode<Integer> list = UniNode.of(0,2,5,1,3,4);
        assertThat(sut.apply(list, 0), is(equalTo(UniNode.of(0,2,5,1,3,4))));
    }
}