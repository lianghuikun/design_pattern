package com.example.state;

/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/4/25/025 21:30
 */
public class Context {
    // 维持不同状态之间的切换
    /*
     *如果是银行系统，这个context就是帐号，根据金额不同，切换状态
     * 比如金额大于100，黄金用户
     */
    private State state;
    public void setState(State state) {
        System.out.println("修改状态");
        this.state = state;
        // 调用状态对应的行为
        state.handle();
    }
}
