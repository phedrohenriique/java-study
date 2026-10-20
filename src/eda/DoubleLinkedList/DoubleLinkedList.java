package eda.DoubleLinkedList;
import java.util.ArrayList;

import eda.Node.Node;

public class DoubleLinkedList {

    int listLength;
    ArrayList<Node> doubledLinkedList = new ArrayList<Node>();
    
    public DoubleLinkedList(){
        this.listLength = doubledLinkedList.size();
    }

    @Override 
    public String toString(){
        return "doubled linked list elements: "+this.listLength;
    }
}
