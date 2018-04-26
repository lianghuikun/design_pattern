package com.example.chain;

/**
 * 领导接口
 */
public abstract class Leader {
    // 名字，需要给子类使用，因此用protected
    protected String name;
    // 下一个领导是谁，责任链的后继对象
    protected Leader nextLeader;
    public Leader(String name) {
        this.name = name;
    }
    public void setNextLeader(Leader leader) {
        this.nextLeader = leader;
    }
    // 由子类处理
    public abstract void handleRequest(LeaveRequest request);
}
