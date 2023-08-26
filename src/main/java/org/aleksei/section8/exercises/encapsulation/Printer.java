package org.aleksei.section8.exercises.encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel >= 0 && tonerLevel <= 100 ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
       if (tonerAmount > 0 && tonerAmount <= 100) {
           int tempAmount = tonerLevel + tonerAmount;
           if (tempAmount > 100) {
               return -1;
           }
           tonerLevel += tonerAmount;
           return tonerLevel;
       }
       return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint  = duplex ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += pagesToPrint ;
        return pagesToPrint ;
    }
}
