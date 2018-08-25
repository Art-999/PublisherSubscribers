package com.company;

public class Main {

    public static void main(String[] args) {

        Newspaper haykakanZamanak=new Newspaper();

        LatinSubscriber latinSubscriber=new LatinSubscriber(haykakanZamanak);
        RussianSubscriber russianSubscriber=new RussianSubscriber(haykakanZamanak);
        ArmenianSubscriber armenianSubscriber=new ArmenianSubscriber(haykakanZamanak);
        //armenianSubscriber.unRegister();
        armenianSubscriber.register(haykakanZamanak);

        haykakanZamanak.setNewsInNewsfeed("VelvetRevolution in Armenia","23.04.2018");
    }
}
