package eda.App;

import eda.Node.*;
import eda.DoubleLinkedList.*;

public class App {
    public static void main(String[] args) {

        DoubleLinkedList linkedList = new DoubleLinkedList();

        Node node1 = new Node(2);
        Node node2 = new Node(4);
        Node node3 = new Node(6);
        Node node4 = new Node(8);
        Node node5 = new Node(10);

        System.out.println(linkedList);
    };
}
