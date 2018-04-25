package com.example.mq_demo;

/**
 * 去银行办理业务，取号、办理、评分
 */
public abstract class BankTemplateMethod {

    public void takeNumber() {
        System.out.println("取号排队");
    }
    // 办理具体业务，抽象方法由子类办理业务时定义算法
    // 也称为钩子方法，调用A子类就调用A子类的方法，B就B的方法
    public abstract void transact();

    public void evaluate() {
        System.out.println("给业务人员评分");
    }
    // 模版方法，把基本操作组合到一起，子类一般不能重写
    public final void process() {
        this.takeNumber();
        // transact就像钩子一样，勾到哪个，调用哪个。
        // 也被称为回调方法
        this.transact();
        this.evaluate();
    }
}
