package org.aleksei.section5.exercises;

public class E4BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return hourOfDay >= 0 && hourOfDay <= 23 && barking && (hourOfDay < 8 || hourOfDay > 22);
    }
}
