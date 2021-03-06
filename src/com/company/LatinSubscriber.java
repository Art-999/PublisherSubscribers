package com.company;

import com.company.interfaces.DisplayElement;
import com.company.interfaces.Subscriber;

public class LatinSubscriber implements Subscriber, DisplayElement {
    private String title;
    private String publishTime;
    private Newspaper newspaper;

    public LatinSubscriber(Newspaper newspaper) {
        newspaper.registerSubscriber(this);
        this.newspaper = newspaper;
    }

    @Override
    public void update(String title, String publishTime) {
        this.title = title;
        this.publishTime = publishTime;
        display();
    }

    @Override
    public void display() {
        System.out.println("Latin Subscriber see in his news feed " + title + ", publishTime: " + publishTime);
    }

    public void unRegister() {
        if (newspaper != null) {
            newspaper.removeSubscriber(this);
        }
    }
}
