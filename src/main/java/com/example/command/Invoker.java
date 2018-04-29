package com.example.command;

// 命令的调用者/发起者（统帅）
public class Invoker {
    // 发起命令，可以是List也可以是一条
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    // 业务方法，用于调用命令类的方法
    public void call() {
        // 调用命令前后也可以做日志
        command.execute();
    }
}
