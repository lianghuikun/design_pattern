package com.example.memento;

/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/4/29/029 15:43
 */
public class Client {
    public static void main(String[] args) {
        CareTaker taker = new CareTaker();
        // Emp中会帮我们new一个备忘录对象
        Emp emp = new Emp("tom", 18, 900);
        System.out.println("--->第一次创建对象:" + emp.getEname() + ",年龄：" + emp.getAge());
        // 备忘一次
        taker.setMemento(emp.memento());
        // 修改数据
        emp.setAge(20);
        emp.setSalary(2000);
        emp.setEname("TOM");
        System.out.println("--->第二次创建对象:" + emp.getEname() + ",年龄：" + emp.getAge());
        System.out.println("----恢复数据----");
        emp.recovery(taker.getMemento());
        System.out.println("--->第三次创建对象:" + emp.getEname() + ",年龄：" + emp.getAge());
    }
}
