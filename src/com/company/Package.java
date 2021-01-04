package com.company;

import java.io.Serializable;

public final class Package implements Serializable {
    private final String name;
    private final int cost;
    private final DropPoint destination;
    private volatile transient int hashCode;

    public Package(String name, int cost, DropPoint destination)
    {
        this.name = name;
        this.cost = cost;
        this.destination = new DropPoint(destination.getStreet(), destination.getNumber());
    }

    public String getName() { return name; }
    public int getCost() { return cost; }
    public DropPoint getDestination() { return new DropPoint(destination.getStreet(), destination.getNumber()); }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Package))
            return false;
        Package p = (Package)o;
        return (p.name.equals(this.name) && p.cost == this.cost &&
                p.destination.getStreet().equals(this.destination.getStreet()) &&
                p.destination.getNumber() == this.destination.getNumber()
        );
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = 7;
            result = 11 * result + cost;
            result = 11 * result + Integer.parseInt(name);
            result = 11 * result + Integer.parseInt(destination.getStreet());
            result = 11 * result + destination.getNumber();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Package: name = " + name + ", cost = " + cost + ", street = " + destination.getStreet() + ", number = " + destination.getNumber();
    }
}