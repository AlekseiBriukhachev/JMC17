package org.aleksei.section11.exercise.abstrwork;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem rightLink) {
        this.rightLink = rightLink;
        return this.rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem leftLink) {
        this.leftLink = leftLink;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
            String itemValue = (String) item.getValue();
            String thisValue = (String) this.getValue();
            if (thisValue != null && itemValue != null) {
                return thisValue.compareTo(itemValue);
            } else {
                return -1;
            }
        } else {
            return -1; // Default comparison result when item is null
        }
    }
}
