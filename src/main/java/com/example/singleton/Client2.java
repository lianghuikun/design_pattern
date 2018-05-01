package com.example.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 多线程下五种单例模式创建效率测试
 */
public class Client2 {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        int threadNum = 10;
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int i1 = 0; i1 < 100000; i1++) {
                    //测试demo1饿汉模式
                    Object o = SingletonDemo1.getInstance();
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println("总耗时:" + (end - start));
    }
}
