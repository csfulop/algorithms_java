package hu.fcs.algorithms.tree;

import org.junit.jupiter.api.Test;

import static hu.fcs.algorithms.tree.BinaryTree.bt;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDepthTest {
    @Test
    public void testMinimumdepth() {
        assertEquals(MinimumDepth.of(null), 0);
        assertEquals(MinimumDepth.of(bt()), 1);
        assertEquals(MinimumDepth.of(bt(bt())), 2);
        assertEquals(MinimumDepth.of(bt(null, bt())), 2);
        assertEquals(MinimumDepth.of(bt(bt(), bt())), 2);
        assertEquals(MinimumDepth.of(bt(bt(bt()))), 3);
        assertEquals(MinimumDepth.of(bt(bt(bt()), bt())), 2);
    }


}
