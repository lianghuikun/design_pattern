package com.example.mediator;

/**
 * 同事类
 */
public interface Department {
    /**
     * 做本部门的事情
     */
    void selfAction();

    /**
     * 让总结里做
     */
    void outAction();
}

// 研发部
class Development implements Department{
    // 持有中介者的引用(总经理)
    private Mediator m;
    public Development(Mediator m) {
        this.m = m;
        // 将当前对象注册到中介者，他们互相可以找到
        m.register("development", this);
    }
    @Override
    public void selfAction() {
        System.out.println("专心科研");
    }
    @Override
    public void outAction() {
        System.out.println("汇报工作！需要资金支持");
    }
}
// 市场部
class Market implements Department{
    // 持有中介者的引用(总经理)
    private Mediator m;
    public Market(Mediator m) {
        this.m = m;
        // 将当前对象注册到中介者，他们互相可以找到
        m.register("market", this);
    }
    @Override
    public void selfAction() {
        System.out.println("专心拓展");
    }
    @Override
    public void outAction() {
        System.out.println("汇报工作！项目进度需要资金支持!");
        // 请总经理下命令，让市场部支持资金
        m.command("finacial");
    }
}
// 财务部
class Finacial implements Department{
    // 持有中介者的引用(总经理)
    private Mediator m;
    public Finacial(Mediator m) {
        this.m = m;
        // 将当前对象注册到中介者，他们互相可以找到
        m.register("finacial", this);
    }
    @Override
    public void selfAction() {
        System.out.println("专心数钱");
    }
    @Override
    public void outAction() {
        System.out.println("汇报工作！钱太多，怎么花!");
    }
}