package ru.netology.manager;

import ru.netology.domain.Ticket;
import ru.netology.repository.ProductRepository;

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
      //  orderResult(result);
        return orderResult(result);
    }

    public boolean matcheArrival(Ticket ticket, String search) {
        return ticket.arrivalMatch(search);

    }

    public boolean matcheDeparture(Ticket ticket, String search) {
       return ticket.departureMatch(search);
    }


    public Ticket[] orderResult(Ticket[] ticket) {
        Ticket tempOne;
        int neatOrder = 1;
        int length = ticket.length - 1;
        while (neatOrder != 0) {
            neatOrder = 0;
            for (int i = 0; i <= (length - 1); i++) {
                if (ticket[i].compareTo(ticket[i + 1]) < 0) {
                    tempOne = ticket[i];
                    ticket[i] = ticket[i + 1];
                    ticket[i + 1] = tempOne;
                    neatOrder++;
                }
            }
        }
        return ticket;
    }

}
