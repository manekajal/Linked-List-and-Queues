package com.linkedlist;

public class LinkedList<T> {

    Node<T> head;
    private int size = 0;

    public LinkedList() {
        this.head = null;
    }

    public void add(T data) {

        Node<T> node = new Node<>(data);
        if (this.head == null) {
            head = node;

        } else {
            Node<T> tempNode = head;
            while (tempNode.next!= null) {
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }
        size++;
    }
    void add(int position , T data){

        if(position==1) {
            Node<T> node = head;
            head = new Node<>(data);
            head.next = node;
            return;
        }
        Node<T> node=head;
        Node<T> previous = new Node<>(data);
        while (position-1>0){
            previous=node;
            node=node.next;
            position--;
        }
        previous.next=new Node<T>(data);
        previous.next.next=node;






    }
    public void delete(T key){
        Node<T> previous = new Node<>(null);

        previous.next=head;
      Node<T>next=head.next;
        Node<T>node=head;
        if(head.data == key){
            head=head.next;
        }
        while (node.next !=null)
        {
            if (String.valueOf(node.data).equals(String.valueOf(key)))
            {
                previous.next=next;

            }
            previous=node;
            node=node.next;
            next=node.next;

        }

    }


    public void print() {
        Node<T> tempNode = this.head;
        while (tempNode.next != null) {
            System.out.println(tempNode.data + " ");
            tempNode = tempNode.next;
        }
        System.out.println(tempNode.data);
    }


    @Override
    public String toString() {
        String S = "{ ";

        Node <T> X = head;

        if (X == null)
            return S + " }";

        while (X.next != null) {
            S += String.valueOf(X.data) + " -> ";
            X = X.next;
        }

        S += String.valueOf(X.data);
        return S + " }";
    }
}