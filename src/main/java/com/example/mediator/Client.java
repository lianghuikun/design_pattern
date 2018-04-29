package com.example.mediator;

/**
 * 需求：财务部、研发部、市场部
 *  如果没有总经理居中协调就乱套了，
 *  财务部直接找其他部门，都是多对多，网状结构
 *
 *  现在使用中介者模式，改为星型结构
 *
 *
 */
public class Client {
    public static void main(String[] args) {
        Mediator m = new President();

        Market market = new Market(m);
        Development development = new Development(m);
        Finacial finacial = new Finacial(m);
        // 查看市场部的动作
        market.selfAction();
        // 查看市场部的交互
        market.outAction();
    }
}
