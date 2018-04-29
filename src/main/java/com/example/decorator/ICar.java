package com.example.decorator;

// 抽象组件
public interface ICar {
    void move();
}

// 具体构建对象(普通车,被装饰对象)
class Car implements ICar {

    @Override
    public void move() {
        System.out.println("路上跑");
    }
}

// 定义装饰器
class SuperCar implements ICar {
    // 持有真实对象的引用
    protected ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

// 具体装饰器 (增加功能，就是 增加装饰器的子类)
class FlyCar extends SuperCar {

    public FlyCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        fly();
    }

    // 新功能
    public void fly() {
        System.out.println("天上飞");
    }
}

// 具体装饰器(水上游)
class WaterCar extends SuperCar {

    public WaterCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        super.move();
        swim();
    }

    // 新功能
    public void swim() {
        System.out.println("水上游");
    }
}
