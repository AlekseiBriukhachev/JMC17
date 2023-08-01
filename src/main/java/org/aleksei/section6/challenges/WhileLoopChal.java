package org.aleksei.section6.challenges;

public class WhileLoopChal {
    public static void main(String[] args) {
        int count = 4;
        int evenCount = 0;
        int oodCount = 0;

        while (count <= 20) {
            count++;
            if (!isEvenNumber(count)) {
                oodCount++;
                continue;
            }
            System.out.println("Even number = " + count);
            evenCount++;

            if (evenCount >= 5){
                break;
            }
        }

        System.out.println("Totally odd numbers found = " + oodCount);
        System.out.println("Totally even numbers found = " + evenCount);
    }
    public static boolean isEvenNumber(int number) {

        return number % 2 == 0;
    }
}
