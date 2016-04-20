package im.sgg.ka.jd.les07.les07_02_01_simplelist;

public class Node {
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
