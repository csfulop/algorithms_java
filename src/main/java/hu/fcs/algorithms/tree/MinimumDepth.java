package hu.fcs.algorithms.tree;

import static java.lang.Math.min;

/**
 * Find minimum depth of a binary tree.
 * Based on: https://www.geeksforgeeks.org/find-minimum-depth-of-a-binary-tree/
 */
public class MinimumDepth {

    public static int of(BinaryTree tree) {
        if (tree == null) {
            return 0;
        } else {
            if (tree.getA() == null) {
                return of(tree.getB()) + 1;
            } else if (tree.getB() == null) {
                return of(tree.getA()) + 1;
            } else {
                return min(of(tree.getA()), of(tree.getB())) + 1;
            }
        }
    }
}
