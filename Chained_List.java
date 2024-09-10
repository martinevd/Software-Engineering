package org.example;


class Node{
    Date date;
    Node next;

    public Node(Date d, Node n){
        date = d;
        next = n;
    }
}

public class Chained_List {
    Node head;
    int length;


    public Chained_List() {
        head = null;
        length = 0;
    }

    public void insert(Date date){
        Node newNode = new Node(date,head);
        head = newNode;
        length++;
    }

    public void insertEnd(Date date){
        Node newNode = new Node(date,null);
        Node actualNode = head;
        while(actualNode.next != null){
            actualNode = actualNode.next;
        }
        actualNode.next = newNode;
        length++;
    }

    public void print(){
        Node current = head;
        while(current != null){
            System.out.println(current.date.printDate());
            current = current.next;
        }
    }

    public int getLength() {
        return length;
    }
    public Node getHead() {
        return head;
    }
}


