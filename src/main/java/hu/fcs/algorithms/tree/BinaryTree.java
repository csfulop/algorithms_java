package hu.fcs.algorithms.tree;

public class BinaryTree {
    public static BinaryTree bt() {
        return new BinaryTree(null, null);
    }

    public static BinaryTree bt(BinaryTree a) {
        return new BinaryTree(a, null);
    }

    public static BinaryTree bt(BinaryTree a, BinaryTree b) {
        return new BinaryTree(a, b);
    }

    private BinaryTree a, b;

    public BinaryTree(BinaryTree a, BinaryTree b) {
        this.a = a;
        this.b = b;
    }

    public BinaryTree getA() {
        return a;
    }

    public void setA(BinaryTree a) {
        this.a = a;
    }

    public BinaryTree getB() {
        return b;
    }

    public void setB(BinaryTree b) {
        this.b = b;
    }
}
