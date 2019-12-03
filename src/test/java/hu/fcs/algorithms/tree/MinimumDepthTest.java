package hu.fcs.algorithms.tree;

import org.junit.jupiter.api.Test;

import static hu.fcs.algorithms.tree.BinaryTree.bt;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MinimumDepthTest {
    @Test
    public void testMinimumdepth() {
        assertThat(MinimumDepth.of(null), is(0));
        assertThat(MinimumDepth.of(bt()), is(1));
        assertThat(MinimumDepth.of(bt(bt())), is(2));
        assertThat(MinimumDepth.of(bt(null, bt())), is(2));
        assertThat(MinimumDepth.of(bt(bt(), bt())), is(2));
        assertThat(MinimumDepth.of(bt(bt(bt()))), is(3));
        assertThat(MinimumDepth.of(bt(bt(bt()), bt())), is(2));
    }


}
