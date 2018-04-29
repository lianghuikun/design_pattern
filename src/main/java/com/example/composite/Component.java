package com.example.composite;

// 抽象组件
public interface Component {
    void operation();
}
// 叶子组件
interface Leaf extends Component {

}
// 容器组件
interface Composite extends Component {
    // 增加
    void add(Component c);
    // 删除
    void remove(Component c);
    // 获取
    Component getChild(int index);
}