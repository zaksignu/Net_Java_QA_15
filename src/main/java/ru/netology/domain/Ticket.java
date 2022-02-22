package ru.netology.domain;

public class Ticket implements Comparable<Ticket> {

    private int id;
    private int price;
    private String departurePlace;
    private String arrivalPlace;
    private int travelTime;

    public Ticket(int id, int price, String departurePlace, String arrivalPlace, int travelTime) {
        this.id = id;
        this.price = price;
        this.departurePlace = departurePlace;
        this.arrivalPlace = arrivalPlace;
        this.travelTime = travelTime;
    }
    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Ticket o) {
        Ticket tick = (Ticket) o;
        return price - o.price;
    }
    public boolean departureMatch(String search) {
        if (departurePlace.contains(search)) {
            return true;
        }
        else return false;
    }

    public boolean arrivalMatch(String search) {
        if (arrivalPlace.contains(search)) {
            return true;
        }
        else return false;
    }
}
