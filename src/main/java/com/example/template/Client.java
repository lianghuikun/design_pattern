package com.example.template;

/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/4/26/026 9:55
 */
public class Client {
    public static void main(String[] args) {
        Game game = new Game("梦幻西游", "LOGIC", new Address("杭州"));
        AbstractCheckParamTemplate crt = GameParamFactory.getInstance(game.getType());
        crt.setParam(game);
        crt.checkParam();// 校验参数
        System.out.println("---------------------------");
        Game game2 = new Game("王者荣耀", "MAGIC", new Address("成都"));
        AbstractCheckParamTemplate crt2 = GameParamFactory.getInstance(game.getType());
        crt2.setParam(game2);
        crt2.checkParam();// 校验参数
    }
}
