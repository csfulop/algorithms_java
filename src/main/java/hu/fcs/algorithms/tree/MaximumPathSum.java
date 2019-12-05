package hu.fcs.algorithms.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Find the maximum path sum in a binary tree.
 * Based on: https://www.geeksforgeeks.org/find-maximum-path-sum-in-a-binary-tree/
 */
public class MaximumPathSum {
    public static int of(BinaryTree<Integer> tree) {
        return of(tree, false);
    }

    public static int of(BinaryTree<Integer> tree, boolean pathGoesUp) {
        if (tree == null || tree.getValue() == null) {
            return 0;
        } else {
            List<Integer> values = new ArrayList<>(
                    asList(
                            tree.getValue(),
                            tree.getValue() + of(tree.getA(), true),
                            tree.getValue() + of(tree.getB(), true)
                    ));
            if (!pathGoesUp) {
                values.addAll(asList(
                        of(tree.getA(), false),
                        of(tree.getB(), false),
                        tree.getValue() + of(tree.getA(), true) + of(tree.getB(), true)
                ));
            }
            return Collections.max(values);
        }
    }
}
