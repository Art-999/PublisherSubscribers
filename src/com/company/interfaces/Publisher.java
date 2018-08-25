package com.company.interfaces;

public interface Publisher {
    void registerSubscriber(Subscriber subscriber);

    void removeSubscriber(Subscriber subscriber);

    void notifyObservers();
}
