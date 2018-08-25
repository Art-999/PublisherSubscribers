package com.company;

import com.company.interfaces.Publisher;
import com.company.interfaces.Subscriber;

import java.util.ArrayList;


public class Newspaper implements Publisher {
    private ArrayList<Subscriber> subscribersList;
    private String title;
    private String publishTime;

    public Newspaper() {
        subscribersList = new ArrayList<>();
    }


    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribersList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        int index = subscribersList.indexOf(subscriber);
        if (index >= 0) {
            subscribersList.remove(subscriber);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < subscribersList.size(); i++) {
            Subscriber subscriber = subscribersList.get(i);
            subscriber.update(title, publishTime);
        }
    }

    public void newsFeesChanged() {
        notifyObservers();
    }

    public void setNewsInNewsfeed(String title, String publishTime) {
        this.title = title;
        this.publishTime = publishTime;
        newsFeesChanged();
    }
}
