package com.example.memento;

/**
 * 源发器类
 */
public class Emp {

    private String ename;

    private int age;

    private double salary;

    // 进行备忘操作，并返回备忘录对象
    public EmpMemento memento() {
        // 备忘录构造需要Emp对象，因此把当前对象传进去
        return new EmpMemento(this);
    }

    // 进行数据恢复，恢复成指定备忘录对象的值
    public void recovery(EmpMemento memento) {
        // 传什么备忘录就恢复到什么时候的状态
        this.ename = memento.getEname();
        this.age = memento.getAge();
        this.salary = memento.getSalary();
    }
    public Emp(String ename, int age, double salary) {
        this.ename = ename;
        this.age = age;
        this.salary = salary;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
