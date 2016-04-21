package im.sgg.ka.jd.les07.les07_02_01_simplelist;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SimpleLinkedList implements Iterable<Object> {
    private Node root;
    private int size;

    public SimpleLinkedList() {
        this(null,0);
    }

    public SimpleLinkedList(Node root, int size) {
        this.root = root;
        this.size = size;
    }

    public void addFirst(Object o) {
        if (o==null) return;
        this.root = new Node(o,root);
        size++;

    }

    public void addLast(Object o) {
        if (o==null) return;
        if (root==null) {
            this.root = new Node(o);
        } else {
            this.getLast().ref = new Node(o);
        }
        size++;
    }
    public void addAfter(Object o,Object after) throws  IllegalStateException{
        if (o==null || after==null) return;
        if (root==null) {                        // empty list
            addFirst(o);
            return;
        } else if (size==1) {                    // 1 element in the list
            root.ref = new Node(o);
        } else if (getLast() == after) {         // last element
            after = new Node (after, (Node) o);
        } else {
            Node a = getPos( after);
            if (a.o==after) {
                Node n = new Node(o, a.ref);
                a.ref = n;
            } else {
                throw new IllegalStateException("Object "+after+" not found.");
            }

        }
        size++;
    }

    public int getSize() {
        return size;
    }

    private Node getLast(){
        Node last = root;
        while (last.ref != null){
            last = last.ref;
        }
        return last;
    }

    private Node getPos(Object after){
        Node a = root;
        while (a!=null && a.ref!=null && a.o != after){
            a = a.ref;
            if (a.o == after) break;
        }
        return a;
    }


    public void printList(){
        Node last = root;
        String out = "{ ";
        for (int i=0 ; i<size ; i++) {
            out+= last.o.toString() + ", ";
            last = last.ref;
        }
        out = "" + size + " " + out.substring(0,out.length()-2) + " }";
        System.out.println(out);
    }

    @Override
    public Iterator<Object> iterator() {
        return new SLLIterator();
    }

    @Override
    public void forEach(Consumer<? super Object> action) {

    }

    @Override
    public Spliterator<Object> spliterator() {
        return null;
    }

    private class SLLIterator implements Iterator<Object> {

        private Node node;

        public SLLIterator() {
        }


        public boolean hasNext(){
            if ((node != null && node.ref != null) ){
                return true;
            } else {
                return false;
            }
        }
        public Object next(){
            if (this.hasNext()) {
                return this.node.o;
            }
            return this;
        }
        public void remove(){
        }

        @Override
        public void forEachRemaining(Consumer<? super Object> action) {

        }
    }

    private class Node {
        private Object o;
        private Node ref;

        public Node() {
            this(null);
        }

        public Node (Object o){
            this(o,null);
        }

        public Node(Object o, Node ref) {
            this.o = o;
            this.ref = ref;
        }
    }
}
