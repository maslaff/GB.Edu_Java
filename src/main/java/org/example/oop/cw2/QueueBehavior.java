package org.example.oop.cw2;

public interface QueueBehavior {
    void takeInQueue(Buyer actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}
