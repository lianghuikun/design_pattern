package com.example.proxy.staticProxy;

/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/4/29/029 16:21
 */
public class Client {
    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);
        proxy.confer();
        // 其实是歌星唱歌
        proxy.sing();
        proxy.collectMoney();
    }
}
