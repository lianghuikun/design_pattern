package com.example.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 总经理(中介者的实现类）--中介
 */
public class President implements Mediator {
    // 为了让中介者知道有哪些同事，定义一个map
    private Map<String, Department> map = new HashMap<>();
    @Override
    public void register(String dname, Department d) {
        map.put(dname, d);
    }

    @Override
    public void command(String dname) {
        // 下命令，调用同事的方法
        map.get(dname).selfAction();
    }
}
