package org.aleksei.section11.abstraction.interfaceclass;

public class Jet implements FlightEnable, Trackable {

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinate recorded");
    }

    @Override
    public FlightStages transition(FlightStages stage) {
        System.out.println(getClass().getSimpleName() + " transitioning");
        return FlightEnable.super.transition(stage);
    }
}
