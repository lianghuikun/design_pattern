package com.example.strategy;

/**
 * 场景：
 *  某个市场人员接到单后的报价策略(CRM系统中常见问题)。报价策略
 *  很复杂，可以简单做如下分类：
 *      普通客户小批量报价
 *      普通客户大批量报价
 *      老客户小批量报价
 *      老客户大批量报价
 *  具体选哪个报价策略，这需要根据实际情况来确定。
 *  这时候，我们使用策略模式即可
 * 策略模式：
 *  策略模式对应于解决某一个问题的算法族，允许从该算法
 *  族群中任选一个算法解决某一问题，同时可以方便的更换算法或者增加新的算法，并且
 *  由客户端决定调用哪个算法。
 * 本质：
 *  分离算法，选择实现
 * 开发中常见的场景：
 *  JAVASE中GUI编程中，布局管理
 *  Spring框架中，Resource接口，资源访问策略
 *  javax.servlet.http.HttpServelt#service
 */
public class MainTest {
    public static void main(String[] args) {
        Strategy strategy = new NewCustomerFewStrategy();
        Context context = new Context(strategy);
        context.printPrice(10.0);
    }
}
