package com.codegym.List;

public class MyLinkedListRun {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        LinkedListSimple ll = new LinkedListSimple(10);
        ll.addFirst(12) ;
        ll.addFirst(152);
        ll.addFirst(120);

        ll.add(1,9);
        ll.add(3,97);
        ll.add(2,90);
        ll.printList();
    }
}
