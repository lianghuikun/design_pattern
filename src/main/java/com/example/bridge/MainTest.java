package com.example.bridge;

/**
 * 桥接模式bridge
 * 场景：
 *  商城系统中常见的商品分类，以电脑为类，
 *  如何良好的处理商品分类销售的问题？
 * 用组合代替多继承
 *
 * 桥接模式总结：
 *      桥接模式可以取代多层继承的方案，多层集成违背了单一指责原则
 *  复用性较差，类的个数也非常多。桥接模式可以极大的减少子类的
 *  个数，从而降低管理和维护的成本
 *      桥接模式极大的提高了系统可扩展性，在两个变化的维度中任意添加一个维度，
 *  都不需要修改原有的系统，符合开闭原则。
 *
 */
public class MainTest {
    public static void main(String[] args) {
        // 销售联想的笔记本电脑
        Computer2 c = new Laptop2(new Lenovo());
        c.sale();
    }
}
