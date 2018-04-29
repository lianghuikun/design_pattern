package com.example.mediator;

/**
 * 中介者
 */
public interface Mediator {
    void register(String dname, Department d);

    void command(String dname);
}
