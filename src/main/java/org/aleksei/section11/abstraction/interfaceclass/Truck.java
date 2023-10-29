package org.aleksei.section11.abstraction.interfaceclass;

public class Truck implements Trackable {
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinate recorded");
    }
}
