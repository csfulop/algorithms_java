package hu.fcs.algorithms.tree;

import org.junit.jupiter.api.Test;

import static hu.fcs.algorithms.tree.BinaryTree.bt;
import static hu.fcs.algorithms.tree.BinaryTree.btv;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MaximumPathSumTest {
    @Test
    public void testMaximumPathSum() {
        assertThat(MaximumPathSum.of(null), is(0));
        assertThat(MaximumPathSum.of(bt()), is(0));
        assertThat(MaximumPathSum.of(btv(1)), is(1));
        assertThat(MaximumPathSum.of(btv(1, btv(2))), is(3));
        assertThat(MaximumPathSum.of(btv(1, null, btv(2))), is(3));
        assertThat(MaximumPathSum.of(btv(1, btv(3), btv(2))), is(6));
        assertThat(MaximumPathSum.of(btv(1, btv(-3), btv(2))), is(3));
        assertThat(MaximumPathSum.of(btv(1, btv(3), btv(-2))), is(4));
        assertThat(MaximumPathSum.of(btv(-10, btv(3), btv(2))), is(3));
        assertThat(
                MaximumPathSum.of(
                        btv(10, btv(2, btv(20), btv(1)), btv(10, btv(-25, btv(3), btv(4))))
                ),
                is(42));
    }
}