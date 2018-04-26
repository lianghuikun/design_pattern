package com.example.template;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/4/26/026 10:12
 */
public class GameParamFactory {

    /**
     * 享元池
     */
    private static Map<String, AbstractCheckParamTemplate> map = new HashMap<>();

    public static AbstractCheckParamTemplate getInstance(String type) {

        if (map.containsKey(type)) {
            return map.get(type);
        } else {
            AbstractCheckParamTemplate template = null;
            if ("LOGIC".equals(type)) {
                template = new MengHuan();
            } else {
                template = new WangZhe();
            }
            return template;
        }
    }

}
