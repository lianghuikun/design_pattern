package com.example.factory.abstractFactory;

/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/5/1/001 10:56
 */
public interface Tyre {
    void revolve();
}

class LuxuryTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("无磨损");
    }
}

class LowTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("磨损快");
    }
}
