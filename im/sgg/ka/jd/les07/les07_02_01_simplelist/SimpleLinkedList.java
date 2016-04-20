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
        if (this.root==null) {
            this.root = (Node) o;
        } else {
            this.root = new Node(o,root);
        }
    }

    public void addLast(Object o) {
    }
    public void addAfter(Object o,Object after) {
    }

    public int getSize() {
        return size;
    }


    private class Node {
        private Object o;
        private Node node;

        public Node() {
            this(null,null);
        }

        public Node(Object o, Node node) {
            this.o = o;
            this.node = node;
        }
    }
}
