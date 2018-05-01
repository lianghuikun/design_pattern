package com.example.factory.simpleFactory;


import com.example.factory.factory.Audi;
import com.example.factory.factory.Byd;
import com.example.factory.factory.Car;

public class Client {
    public static void main(String[] args) {
        /**
         * 不使用工厂时，客户端，需要知道的东西太多，需要new，
         * 还得需要知道在怎么new(new需要传的参数)
         */
        // 没有工厂模式的情况下
        Car c1 = new Audi();
        Car c2 = new Byd();
        c1.run();
        c2.run();
        // 工厂模式
        Car c3 = CarSimpleFactory.createCar("奥迪");
        c3.run();
    }
}
