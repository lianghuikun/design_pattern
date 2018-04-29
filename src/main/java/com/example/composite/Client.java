package com.example.composite;

/**
 * 组合模式使用场景：
 *  把部分和整体的关系用树形结构来表示，从而使客户端可以
 *  使用统一的方式处理部分对象和整体对象
 * 组合模式和组合是两码事。
 *  组合是， A为B的属性，B就拥有了A的方法等，这就是组合。
 *  而组合模式，用于处理树形结构，可以天然的递归
 * 处理树形结构，一般都使用组合模式。
 * 组合模式核心：
 *  抽象构建角色(component)：定义了叶子和容器构建的共同点
 *  叶子构建角色(leaf)构建角色：无子节点
 *  容器(composite)构建角色：有容器特征，可以包含子节点
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile f2, f3, f4, f5;
        Foler f1 = new Foler("我的收藏");
        f2 = new Foler("图片收藏");
        f3 = new Foler("视频收藏");
        f2.killVirus();
        System.out.println("-----");
        f1.add(f2);
        f1.add(f3);
        f1.killVirus();
    }
}
