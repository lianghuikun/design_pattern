package com.example.iterator;

/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/4/29/029 13:43
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMyAggregate cma = new ConcreteMyAggregate();
        cma.addObject("1");

        MyIterator it = cma.createIterator();

        while (it.hasNext()) {
            System.out.println(it.getCurrentObj());
            it.next();
        }
    }
}
