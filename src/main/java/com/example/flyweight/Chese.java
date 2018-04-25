package com.example.flyweight;

// 享元类
public interface Chese {
    // 设置颜色
    void setColor(String c);
    // 获取颜色
    String getColor();
    // 指定坐标显示棋子
    void display(Coordinate c);

    // 大小和形状这里就省略了
}

// 内部状态，大小和形状这里就省略了
class ConcreteChess implements Chese{
    // 颜色是共享的，是内部状态
    private String color;

    public ConcreteChess(String color) {
        this.color = color;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色:" + color);
        System.out.println("棋子显示的位置：" + c.getX());
    }
}