package com.example.chain;

/**
 * 责任链模式chain of responsibility
 * 定义：
 *  将能够处理同一类请求的对象连成一条链，锁提交的请求沿着链传递，
 *  链上的对象逐个判断是否有能力处理该请求，如果能则处理，如果不能
 *  则传递给链上的下一个对象
 * 场景：
 *  打牌时，轮流出牌
 *  接力赛跑
 *  大学中，奖学金审批
 *  公司中，公文审批
 *
 *  需求：
 *      公司里面，报销个单据需要经过流程：
 *          审批人填写申请单，申请给经历
 *          小于1000，经理审批
 *          超过1000，总经理审批
 *          总经理审批ton故宫
 *      公司里面，请假条的审批流程：
 *          如果请假天数小于3天，主任审批
 *          如果大于等于3天，小于10天，经理审批
 *          如果大于10天，小于30天，总经理审批
 *          如果大于等于30天，提示拒绝
 *    如果用if，添加逻辑，比如副总经理审批，则需要修改代码，而且逻辑复杂
 *  责任链上下级关系，由客户端维护。
 *  开发中的常见的场景：
 *      java中，异常机制，try catch
 *      javascript中事件的额冒泡和捕获机制。java中事件的处理采用观察者模式。
 *      servlet开发中，过滤器的链式处理
 *      struts2中，拦截器的调用也是典型的责任链模式。
 */
public class MainTest {
    public static void main(String[] args) {
        Leader a = new Director("张主任");
        Leader b = new Manager("李经理");
        Leader c = new GeneralManager("王总经理");

        // 组织责任链对象的关系
        a.setNextLeader(b);
        b.setNextLeader(c);

        // 请假
        LeaveRequest req1 = new LeaveRequest("tom", 11, "XIANGQIN");
        // 主任处理
        a.handleRequest(req1);
    }
}
