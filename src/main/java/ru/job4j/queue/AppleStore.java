package ru.job4j.queue;

import java.util.Queue;
public class AppleStore {
    private final Queue<Customer> queue;
    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        Customer lastCustomer = null;
        for (int i = 0; i < queue.size(); i++) {
            lastCustomer = queue.poll();
        }
        return lastCustomer.getName();
    }

    public String getFirstUpsetCustomer() {
        Customer upsetCustomer = null;
        for (int i = 0; i <= queue.size() + 1; i++) {
            upsetCustomer = queue.poll();
        }
        return upsetCustomer.getName();
    }
}
