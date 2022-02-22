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

    public void findAll(String departure, String arrival) {
        Ticket[] result = new Ticket[0];
        for (Ticket product : ticketManager.showThings()) {
            if ((matcheDeparture(product, departure))&&(matcheArrival(product, departure))) {
           //     length++;
                Ticket[] tmpsearch = new Ticket[result.length+1];
                System.arraycopy(result, 0, tmpsearch, 0, result.length);
                int lastIndex = result.length - 1;
                tmpsearch[lastIndex] = product;
                result = tmpsearch;
            }
        }
       int length = result.length;
        Ticket[] resultA = new Ticket[0];
        for (Ticket productD : result) {
            if(matcheDeparture(productD,arrival)){
                Ticket[] tmpsearch = new Ticket[resultA.length+1];
                System.arraycopy(resultA, 0, tmpsearch, 0, resultA.length);
                int lastIndex = resultA.length - 1;
                tmpsearch[lastIndex] = productD;
                resultA = tmpsearch;
            }

        }
    }

    public boolean matcheArrival(Ticket ticket, String search) {
        return ticket.arrivalMatch(search);

    }    public boolean matcheDeparture(Ticket ticket, String search) {
        return ticket.departureMatch(search);
    }
    }


//
//    public Ticket[] searchByDepature(String text) {
//        Ticket[] result = new Ticket[0];
//        for (Ticket product : thingsManager.showThings()) {
//            if (product.compareTo())
//            if (matches(product, text)) {
//                length++;
//                Ticket[] tmpsearch = new Ticket[length];
//                System.arraycopy(result, 0, tmpsearch, 0, result.length);
//                int lastIndex = length - 1;
//                tmpsearch[lastIndex] = product;
//                result = tmpsearch;
//          }
//        //return null;
//    }
//
//    public Ticket[] searchByArrival(String text) {
//        return null;
//    }
////    public Ticket[] searchBy(String text) {
////        int length = 0;
////        Ticket[] result = new Ticket[0];
////        for (Ticket product : thingsManager.showThings()) {
//////            if (matches(product, text)) {
//////                length++;
//////                Ticket[] tmpsearch = new Ticket[length];
//////                System.arraycopy(result, 0, tmpsearch, 0, result.length);
//////                int lastIndex = length - 1;
//////                tmpsearch[lastIndex] = product;
//////                result = tmpsearch;
////            }
////        }
////    //    return result;
////        //return null;
////    }
//
////   // public boolean matches(Ticket product, String search) {
////        return product.matches(search);
////    }
//
//}
