package com.example.factory.abstractFactory;

// 坐骑
public interface Seat {
    void message();
}

class LuxurySeat implements Seat {

    @Override
    public void message() {
        System.out.println("会按摩");
    }
}

class LowSeat implements Seat {

    @Override
    public void message() {
        System.out.println("不会按摩");
    }
}