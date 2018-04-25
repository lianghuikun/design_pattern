package com.example.mq_demo;

/**
 * 模版方法模式，抽取不变的部分，让变的部分自己实现
 * 定了一个算法骨架，骨架中的部分步骤可以延迟到子类中实现
 * 新的子类可以在不改变算法结构的前提下，可以重新定义算法(方法)
 * eg： 1、请客吃饭
 *          流程：
 *              点单
 *              吃东西(吃什么在吃的时候才知道)
 *              买单
 *
 *      2、银行办业务
 *          流程：
 *              取号排队
 *              办理业务(个人/企业/转账/理财) 办理业务的时候才知道办理什么业务
 *              评分
 *  什么时候使用？
 *      实现一个算法时，整体步骤很固定。但是，某些部分易变，
 *      易变的部分可以抽象出来，供子类实现。
 *  开发中常见的场景：
 *      非常频繁，各个框架、类库都有使用。
 *      数据库访问的封装
 *      Junit单元测试
 *      servlet中doGet/doPost方法调用
 *      Hibernate中模版程序
 *      Spring中JdbcTemplate、HibernateTemplate等
 */
public class MainTest {
    public static void main(String[] args) {
        // 取款
        BankTemplateMethod drawMoney = new DrawMoney();
        // 子类无法调用父类，而是通过父类调用子类
        drawMoney.process();

        // 采用匿名内部类，因为不是接口，是抽象类无法使用lambda表达式
        BankTemplateMethod btm2 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要存钱");
            }
        };
        btm2.process();
    }
}
