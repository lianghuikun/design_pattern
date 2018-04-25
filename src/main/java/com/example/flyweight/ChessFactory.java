package com.example.flyweight;

import java.util.HashMap;
import java.util.Map;

// 享元工厂类
public class ChessFactory {
    // 享元池
    private static Map<String, Chese> map = new HashMap<>();

    public static Chese getChess(String color) {
        if (map.get(color) != null) {
            return map.get(color);
        }else {
            Chese chese = new ConcreteChess(color);
            map.put(color, chese);
            return chese;
        }
    }
}
