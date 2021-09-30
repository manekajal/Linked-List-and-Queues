package com.linkedlist;

public class Main <T> {

    public static void main(String[] args){
        LinkedList <Integer> list1 = new LinkedList<>();
        System.out.println("Integer");

        list1.add(56);
        list1.add(30);
        list1.add(70);

        System.out.println(list1);

        System.out.println("After deleting the value ");
                list1.delete(30);
        System.out.println(list1);




    }
}
