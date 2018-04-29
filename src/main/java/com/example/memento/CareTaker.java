package com.example.memento;

/**
 * 负责人类
 *  负责管理备忘录对象
 */
public class CareTaker {
    private EmpMemento memento;

    // 如果想备份很多次，则用容器
//    private List<EmpMemento> list = new ArrayList<>();

    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}
