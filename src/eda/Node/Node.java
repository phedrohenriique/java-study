package eda.Node;

public class Node {

    private int value;
    private Node previous = null;
    private Node next = null;

    public Node(int value) {
        this.value = value;
    }

    @Override 
    public String toString(){
        return "value: "+this.value;
    }

}
