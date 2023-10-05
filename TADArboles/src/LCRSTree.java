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
    private class LCRSnode<T> implements Position<E> {
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

        public LCRSnode<E> getLeftChild() {
            return child;
        }

        public LCRSnode<E> getRightSiblling() {
            return siblling;

        }

        public void setParent(LCRSnode<E> parent) {
            this.parent = parent;
        }

        public void setLeftChild(LCRSnode<E> child) {
            this.child = child;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public void setRightSiblling(LCRSnode<E> siblling) {
            this.siblling = siblling;
        }

        @Override
        public E getElement() {
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
    public Position<E> add(E e, Position<E> p) {
        LCRSnode<E> padre = checkPosition(p);
        LCRSnode<E> nodo = new LCRSnode<E>(e);

        if (padre.getLeftChild() == null)
            padre.setLeftChild(nodo);
        else {
            LCRSnode<E> hijo = padre.getLeftChild();
            while (hijo.getRightSiblling() != null) {
                hijo = hijo.getRightSiblling();
            }
            hijo.setRightSiblling(nodo);

        }
        size++;
        return nodo;
    }
    @Override
    public Position<E> add(E element, Position<E> p, int n) {
        return null;
    }
    private LCRSnode<E> checkPosition(Position<E> p) {
        if (!(p instanceof LCRSTree.LCRSnode)) {
            throw new RuntimeException("The position is invalid");}

        return (LCRSnode<E>) p;
        }
    @Override
    public void swapElements(Position<E> p1, Position<E> p2) {
        LCRSnode<E> nodo1 = checkPosition(p1);
        LCRSnode<E> nodo2 = checkPosition(p1);
        E aux = nodo1.getElement();
        nodo1.setElement(nodo2.getElement());
        nodo2.setElement(aux);

    }

    @Override
    public E replace(Position<E> p, E e) {
        LCRSnode nodo = checkPosition(p);
        E ultimo = (E) nodo.getElement();
        nodo.setElement(e);
        return ultimo;
    }

    @Override
    public void remove(Position<E> p) {
        LCRSnode <E> node = checkPosition(p);
        if (node == root){
            root = null;
            size = 0;
        } else {
            LCRSnode <E> padre = node.getParent();
            if (padre.getLeftChild() == node){
                padre.setLeftChild(node.getRightSiblling());
            } else {
                if (node.getRightSiblling() == null){
                    node = null;
                } else {
                    while ()
                }
            }
        }

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
