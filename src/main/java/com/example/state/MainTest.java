package com.example.state;

/**
 * 场景：
 *  电梯运行
 *      维修、正常、自动关门、自动开门、向上运行、向下运行、消防状态
 *  红绿灯
 *      红灯、黄灯、绿灯
 *  企业或政府系统
 *      公文的审批状态
 *          报销单据审批状态
 *          假条审批
 *  网购时订单状态
 *      下单
 *      已付款
 *      已发火
 *      送货中
 *      已收货
 *  酒店系统中，房间的状态变化：
 *      已预定
 *      已入住
 *      空闲
 *  不同状态对应不同的行为。
 *  频繁判断同一个状态时，需要使用状态模式。
 *
 *  核心：
 *      用于解决系统中复杂对象的状态转换
 *   以及不同状态下行为的封装问题
 *  结构：
 *      Context环境类，环境类中维护一个state对象，定了当前的状态
 *      State抽象状态类
 *      ConcreteState具体状态类，每一个类封装了一个状态对应的行为
 *  开发中常见场景：
 *      银行系统中帐号状态的管理
 *      OA系统中公文状态的管理
 *      酒店系统中，房间状态的管理
 *      线程对象各状态之间的切换
 */
public class MainTest {
    public static void main(String[] args) {
        Context context = new Context();
        //
        context.setState(new FreeState());
    }
}
