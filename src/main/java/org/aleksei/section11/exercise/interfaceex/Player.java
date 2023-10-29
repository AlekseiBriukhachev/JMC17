package org.aleksei.section11.exercise.interfaceex;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> result = new ArrayList<>();
        result.add(0, name);
        result.add(1, String.valueOf(hitPoints));
        result.add(2, String.valueOf(strength));
        result.add(3, weapon);
        return result;
    }

    @Override
    public void read(List<String> fields) {
        if (fields != null && fields.size() > 0) {
           name = fields.get(0);
           hitPoints = Integer.parseInt(fields.get(1));
           strength = Integer.parseInt(fields.get(2));
           weapon = fields.get(3);
        }
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "'" +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + "'}";
    }
}
