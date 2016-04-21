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

    private Node getPos(Object o){
        Node a = root;
        while (a!=null && a.ref!=null && a.o != o){
            a = a.ref;
            if (a.o == o) break;
        }
        return a;
    }

    private Node getPrev(Object o){
        Node a = root;
        while (a!=null && a.ref!=null && a.ref.o != o){
            if (a.ref.o == o) break;
            a = a.ref;

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
        if (size==0) {
            out = "" + size + " { }";
        } else {
            out = "" + size + " " + out.substring(0, out.length() - 2) + " }";
        }

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
        private Node prev;

        public SLLIterator() {
        }


        public boolean hasNext(){
            return (node == null && root!=null) || (node != null && node.ref != null);
        }
        public Object next(){
            if (node == null && root!=null){
                node=root;
                return node.o;
            }

            if (this.hasNext()) {
                prev = node;
                node = node.ref;
                return node.o;
            }
//            return this;
            throw new IllegalStateException("There're no more elements in this list");
        }

        public void remove(){
            prev = getPrev(node);
            if (size==1 && !hasNext()) {
                node =null;
                root = null;
            } else if (prev!=null && prev.ref!=null && prev.ref.o==node) {
                Node n = prev.ref;
                Node ref = n.ref;
                prev.ref.ref = null;
                prev.ref.o = null;
                prev.ref = ref;
//            } else {
//                throw new IllegalStateException("Object "+node+" not found.");
            }

            size--;

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
