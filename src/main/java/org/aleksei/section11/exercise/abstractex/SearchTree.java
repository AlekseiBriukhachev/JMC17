package org.aleksei.section11.exercise.abstractex;

public class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem newItem) {

        if (root == null) {
            root = newItem;
            return true;
        }

        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    newItem.setNext(currentItem);
                    return true;
                }
            } else {
                // Item already exists
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
                        performRemoval(current.next(), current.previous());
                    }
                }
                return true;
            }
            current = current.next();
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if (item != null) {
            if (item.previous() == null && item.next() == null) {
                if (parent != null) {
                    if (parent.next() == item) {
                        parent.setNext(null);
                    } else {
                        parent.setPrevious(null);
                    }
                }
            } else if (item.previous() == null) {
                if (parent != null) {
                    if (parent.next() == item) {
                        parent.setNext(item.next());
                    } else {
                        parent.setPrevious(item.next());
                    }
                }
            } else if (item.next() == null) {
                if (parent != null) {
                    if (parent.next() == item) {
                        parent.setNext(item.previous());
                    } else {
                        parent.setPrevious(item.previous());
                    }
                }
            } else {
                // Both left and right children are present
                ListItem smallestRight = item.next();
                ListItem smallestRightParent = item;
                while (smallestRight.previous() != null) {
                    smallestRightParent = smallestRight;
                    smallestRight = smallestRight.previous();
                }
                item.setValue(smallestRight.getValue());
                performRemoval(smallestRight, smallestRightParent);
            }
        }
    }


    @Override
    public void traverse(ListItem root) {
//         if (root != null) {
//             traverse(root.previous());
//             System.out.println(root.getValue());
//             traverse(root.next());
//         }
        if (root != null) {
            ListItem current = root;
            while (current != null) {
                System.out.println(current.getValue());
                current = current.next();
            }
        }
    }
}
