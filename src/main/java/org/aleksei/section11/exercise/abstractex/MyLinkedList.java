package org.aleksei.section11.exercise.abstractex;

public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {

        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (root == null || item == null) {
            return false;
        }

        ListItem current = root;
        while (current != null) {
            if (current.compareTo(item) == 0) {
                if (current == root) {
                    root = current.next();
                    if (root != null) {
                        root.setPrevious(null);
                    }
                } else {
                    current.previous().setNext(current.next());
                    if (current.next() != null) {
                        current.next().setPrevious(current.previous());
                    }
                }
                return true;
            }
            current = current.next();
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            ListItem current = root;
            while (current != null) {
                System.out.println(current.getValue());
                current = current.next();
            }
        }
    }
}
