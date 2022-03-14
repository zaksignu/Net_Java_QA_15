package ru.netology.domain;

public class Player implements Comparable<Player>{

    private int id;
    private String name;
    private int strenght;

    public Player(int id, String name, int strenght) {
        this.id = id;
        this.name = name;
        this.strenght = strenght;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Player o) {
        return strenght - o.strenght;
    }
}
