package im.sgg.ka.jd.les07.les07_02_01_simplelist;

public class SimpleLinkedList {
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
        if (o==null) return;
        if (root==null) {                        // empty list
            addFirst(o);
        } else if (size==1) {                    // 1 element in the list
            root.ref = new Node(o);
        } else if (getLast() == after) {         // last element
            after = new Node (after, (Node) o);
        } else {
            Node a = getAfter(after);
            Node n = new Node(o, a.ref);
            a.ref = (Node) n.o;
        }
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

    private Node getAfter(Object after){
        Node a = root;
        while (a!=null && a != after){
            a = a.ref;
        }
        return a;
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
