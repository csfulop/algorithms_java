package hu.fcs.algorithms.tree;

import org.junit.jupiter.api.Test;

import static hu.fcs.algorithms.tree.BinaryTree.bt;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class IsFullTest {

    @Test
    public void testIsFull() {
        assertThat(IsFull.of(null), is(true));
        assertThat(IsFull.of(bt()), is(true));
        assertThat(IsFull.of(bt(bt(), null)), is(false));
        assertThat(IsFull.of(bt(null, bt())), is(false));
        assertThat(IsFull.of(bt(bt(), bt())), is(true));
        assertThat(IsFull.of(bt(bt(bt(), bt()), bt())), is(true));
        assertThat(IsFull.of(bt(bt(bt(), null), bt())), is(false));
    }
}