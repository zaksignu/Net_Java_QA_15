package ru.netology.manager;

import ru.netology.domain.Ticket;
import ru.netology.repository.ProductRepository;

import java.util.Arrays;

public class ProductManager {
    private ProductRepository ticketManager;

    public ProductManager(ProductRepository ticketManager) {
        this.ticketManager = ticketManager;
    }

    public void add(Ticket ticket) {
        ticketManager.addProduct(ticket);
    }

    public void removeById(int id) {
        ticketManager.removeThing(id);
    }

    public Ticket[] findAll(String departure, String arrival) {
        Ticket[] result = new Ticket[0];
        for (Ticket product : ticketManager.showThings()) {
            if ((matcheDeparture(product, departure)) & (matcheArrival(product, arrival))) {
                int length = result.length;
                Ticket[] tmpsearch = new Ticket[length + 1];
                System.arraycopy(result, 0, tmpsearch, 0, result.length);
                int lastIndex = length;
                tmpsearch[lastIndex] = product;
                result = tmpsearch;
            }
        }
        return orderResult(result);
    }

    public boolean matcheArrival(Ticket ticket, String search) {
        return ticket.arrivalMatch(search);

    }

    public boolean matcheDeparture(Ticket ticket, String search) {
        return ticket.departureMatch(search);
    }


    public Ticket[] orderResult(Ticket[] ticket) {
        Arrays.sort(ticket);
        return ticket;
    }

}
