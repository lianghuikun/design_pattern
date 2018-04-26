package com.example.template;

/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/4/26/026 9:51
 */
public abstract class AbstractCheckParamTemplate {

    private Game param;

    public final void checkParam() {
        Game game = getParam();
        checkName(game.getName());
        String type = game.getType();
        checkAddress(game.getAddress());
       /* if ("LOGIC".equals(type)) {
            checkAddress(game.getAddress());
        } else {
            System.out.println("建议玩益智类游戏!");
        }*/
    }


    public void checkName(String name) {
        System.out.println("AbstractCheckParamTemplate--->checkName, name:" + name);
    }

    public abstract void checkAddress(Address address);

    public Game getParam() {
        return param;
    }

    public void setParam(Game param) {
        this.param = param;
    }
}
