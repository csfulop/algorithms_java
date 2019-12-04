package hu.fcs.algorithms.tree;

import java.util.LinkedList;
import java.util.Queue;

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

    /**
     * Better solution with Level Order Traversal
     *
     * @param tree
     * @return
     */
    public static int of2(BinaryTree tree) {
        class Item {
            int depth;
            BinaryTree tree;

            public Item(int depth, BinaryTree tree) {
                this.depth = depth;
                this.tree = tree;
            }
        }
        Queue<Item> items = new LinkedList<>();
        if (tree == null) {
            return 0;
        } else {
            items.add(new Item(1, tree));
        }
        while (items.size() > 0) {
            Item current = items.remove();
            if (current.tree.getA() == null && current.tree.getB() == null) {
                return current.depth;
            }
            if (current.tree.getA() != null) {
                items.add(new Item(current.depth + 1, current.tree.getA()));
            }
            if (current.tree.getB() != null) {
                items.add(new Item(current.depth + 1, current.tree.getB()));
            }
        }
        throw new RuntimeException();
    }
}
