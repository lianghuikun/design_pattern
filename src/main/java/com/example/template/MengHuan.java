package com.example.template;

/**
 * @Author: lianghuikun
 * @Description: TODO
 * @Date: 2018/4/26/026 9:54
 */
public class MengHuan extends AbstractCheckParamTemplate {
    @Override
    public void checkAddress(Address address) {
        System.out.println("MengHuan---->" + address.getName());
    }
}
