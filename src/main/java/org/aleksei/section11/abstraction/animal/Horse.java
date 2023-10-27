package org.aleksei.section11.abstraction.animal;

public class Horse extends Mammal {
    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " shed in the spring");
    }

    @Override
    public void makeNoise() {

    }
}
