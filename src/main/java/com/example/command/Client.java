package com.example.command;

public class Client {
    public static void main(String[] args) {
        Command c = new ConcreteCommand(new Receiver());
        Invoker i = new Invoker(c);
        i.call();
        // 如果算法很简单，可以直接用下面的，但是不易于扩展
        // 如果不需要扩展，算法不变，可以直接调用
        // new Receiver().action();
    }
}
