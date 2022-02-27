package ru.netology.repository;

import ru.netology.domain.Ticket;

public class ProductRepository {

    private Ticket[] paperFolder = new Ticket[0];

    public void addProduct(Ticket thing) {
        int length = paperFolder.length + 1;
        Ticket[] tmp = new Ticket[length];
        System.arraycopy(paperFolder, 0, tmp, 0, paperFolder.length);
        tmp[tmp.length - 1] = thing;
        paperFolder = tmp;

    }

    public Ticket[] showThings() {
        return paperFolder;
    }

    public void removeThing(int id) {
        int length;
        int p = 0;
        length = paperFolder.length;
        Ticket[] tmp = new Ticket[length - 1];
        for (int i = 0; i < length; i++) {
            if (id != paperFolder[i].getId()) {
                tmp[p] = paperFolder[i];
                p++;
            }
        }
        paperFolder = tmp;

    }
}

