package com.example.decorator;

/**
 * 职责：
 *  1、动态的为一个对象增加新的功能
 *  2、装饰模式是一种用于代替继承的技术，无需通过继承增加子类就
 *  能扩展对象的功能。使用对象的关联关系代替继承关系，更加
 *  灵活，同时避免类型体系的快速膨胀
 *
 *  场景：
 *      车分为: 飞行汽车、水上汽车、人工智能车 (这些的确可以使用继承完成)
 *      但是需要  既能飞又能水上行驶的汽车、既能潜水又能飞的汽车(这时候如果使用继承，则需要大量的子类)
 *    可以通过装饰模式，通过组合方式实现，而不是通过增加子类。
 *
 */
public class Client {
    public static void main(String[] args) {
        // 真是角色
        Car car = new Car();
        car.move();
        System.out.println("------增加新功能----");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        System.out.println("------继续增加新功能----");
        WaterCar waterCar = new WaterCar(flyCar);
        waterCar.move();
        // 可以任意添加功能，在增加某些功能的基础之上，还可以继续增加
    }
}
