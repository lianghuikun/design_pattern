package com.example.command;

//　命令接口
public interface Command {
    /**
     * 执行命令
     * 实际项目中，可以根据需求设计多个不同的方法
     */
    void execute();
}

class ConcreteCommand implements Command {
    // 命令真正的执行者
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        // 可以在前后执行相关的处理，比如记录日志
        receiver.action();
    }
}