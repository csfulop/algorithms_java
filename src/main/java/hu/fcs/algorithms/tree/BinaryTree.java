package hu.fcs.algorithms.tree;

public class BinaryTree<T> {
    public static <T> BinaryTree<T> bt() {
        return new BinaryTree<>(null, null, null);
    }

    public static <T> BinaryTree<T> bt(T value) {
        return new BinaryTree<>(value, null, null);
    }

    public static <T> BinaryTree<T> bt(BinaryTree<T> a) {
        return new BinaryTree<>(null, a, null);
    }

    public static <T> BinaryTree<T> bt(BinaryTree<T> a, BinaryTree<T> b) {
        return new BinaryTree<>(null, a, b);
    }

    private BinaryTree<T> a, b;
    private T value;

    public BinaryTree(T value, BinaryTree<T> a, BinaryTree<T> b) {
        this.value = value;
        this.a = a;
        this.b = b;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinaryTree<T> getA() {
        return a;
    }

    public void setA(BinaryTree<T> a) {
        this.a = a;
    }

    public BinaryTree<T> getB() {
        return b;
    }

    public void setB(BinaryTree<T> b) {
        this.b = b;
    }
}
