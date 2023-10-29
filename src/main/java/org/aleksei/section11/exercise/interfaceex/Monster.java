package org.aleksei.section11.exercise.interfaceex;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> result = new ArrayList<>();
        result.add(0, name);
        result.add(1, String.valueOf(hitPoints));
        result.add(2, String.valueOf(strength));
        return result;
    }

    @Override
    public void read(List<String> fields) {
        if (fields != null && fields.size() > 0) {
            name = fields.get(0);
            hitPoints = Integer.parseInt(fields.get(1));
            strength = Integer.parseInt(fields.get(2));
        }
    }



    @Override
    public String toString() {
        return "Monster{name='" + name + "'" +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength + "}";
    }
}
