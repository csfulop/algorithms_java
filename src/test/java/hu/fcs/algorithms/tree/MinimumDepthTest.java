package hu.fcs.algorithms.tree;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static hu.fcs.algorithms.tree.BinaryTree.bt;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MinimumDepthTest {
    @Test
    public void testMinimumdepth() {
        testMinimumDepthFor(MinimumDepth::of);
    }

    @Test
    public void testMinimumdepth2() {
        testMinimumDepthFor(MinimumDepth::of2);
    }

    private void testMinimumDepthFor(Function<BinaryTree, Integer> f) {
        assertThat(f.apply(null), is(0));
        assertThat(f.apply(bt()), is(1));
        assertThat(f.apply(bt(bt())), is(2));
        assertThat(f.apply(bt(null, bt())), is(2));
        assertThat(f.apply(bt(bt(), bt())), is(2));
        assertThat(f.apply(bt(bt(bt()))), is(3));
        assertThat(f.apply(bt(bt(bt()), bt())), is(2));
    }
}
