import material.Position;

import java.util.Iterator;


/**
 * An implementation of .the NAryTree interface using left-child, right-sibling representation.
 *
 * @param <E> the type of elements stored in the tree
 */
public class LCRSTree<E> implements NAryTree<E> {
    private int size;
    private  LCRSnode<E> root;
    private class LCRSnode<T> implements Position<T> {
        private E element;
        private LCRSnode<E> parent;
        private LCRSnode<E> child;
        private LCRSnode<E> siblling;

        public LCRSnode(E element, LCRSnode<E> parent) {
            this.element = element;
            this.parent = parent;
        }

        public LCRSnode(E element) {
            this.element = element;
        }

        public LCRSnode<E> getParent() {
            return parent;
        }

        public LCRSnode<E> getChild() {
            return child;
        }

        public LCRSnode<E> getSiblling() {
            return siblling;

        }

        @Override
        public T getElement() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

    }

    @Override
    public Position<E> addRoot(E e) {
        if(!isEmpty()){
            throw new RuntimeException("The tree has already a root node");
        }
        root = new LCRSnode<E>(e);
        size++;
        return root;
    }

    @Override
    public Position<E> add(E element, Position<E> p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Position<E> add(E element, Position<E> p, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void swapElements(Position<E> p1, Position<E> p2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E replace(Position<E> p, E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(Position<E> p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NAryTree<E> subTree(Position<E> v) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void attach(Position<E> p, NAryTree<E> t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    @Override
    public Position<E> root() {

        return root;
    }

    @Override
    public Position<E> parent(Position<E> v) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterable<? extends Position<E>> children(Position<E> v) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isInternal(Position<E> v) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isLeaf(Position<E> v) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isRoot(Position<E> v) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterator<Position<E>> iterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
