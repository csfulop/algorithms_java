package hu.fcs.algorithms.tree;

/**
 * Full binary tree or not?
 * A full binary tree: a binary tree in which all nodes have either zero or two child nodes.
 * Based on: https://www.geeksforgeeks.org/check-whether-binary-tree-full-binary-tree-not/
 */
public class IsFull {
    public static boolean of(BinaryTree tree) {
        if (tree == null) {
            return true;
        }
        if (tree.getA() == null && tree.getB() == null) {
            return true;
        }
        if ((tree.getA() == null && tree.getB() != null) || (tree.getA() != null && tree.getB() == null)) {
            return false;
        }
        return of(tree.getA()) && of(tree.getB());
    }
}
