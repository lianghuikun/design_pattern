package com.example.factory.simpleFactory;

import com.example.factory.factory.Audi;
import com.example.factory.factory.Byd;
import com.example.factory.factory.Car;

/**
 * @Author: lianghuikun
 * @Description: 简单工厂
 * @Date: 2018/5/1/001 10:05
 */
public class CarSimpleFactory {

    public static Car createCar(String type) {
        if ("奥迪".equals(type)) {
            return new Audi();
        } else if ("比亚迪".equals(type)) {
            return new Byd();
        } else {
            /**
             * 简单工厂，有问题，如果新增类型，
             * 还得修改代码，不符合开闭原则
             * 工厂方法模式可以解决这个问题
             */
            return null;
        }
    }
}
