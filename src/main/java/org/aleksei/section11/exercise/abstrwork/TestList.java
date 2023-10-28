package org.aleksei.section11.exercise.abstrwork;

public class TestList {
    public static void main(String[] args) {
        Node node1 = new Node("12");
        MyLinkedList list = new MyLinkedList(node1);
        System.out.println(list.addItem(new Node("23")));
//        System.out.println(list.addItem(new Node("0")));
        System.out.println(list.addItem(new Node("2")));
        System.out.println(list.addItem(new Node("12")));
        System.out.println(list.removeItem(node1));
        list.traverse(node1);

        SearchTree sTree = new SearchTree(node1);
        System.out.println(sTree.addItem(new Node("21")));
//        System.out.println(sTree.addItem(new Node("0")));
        System.out.println(sTree.addItem(new Node("24")));
        System.out.println(sTree.addItem(new Node(null)));
        sTree.traverse(node1);
    }
}
