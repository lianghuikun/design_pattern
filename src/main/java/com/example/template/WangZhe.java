package com.example.template;

public class WangZhe extends AbstractCheckParamTemplate {
    @Override
    public void checkAddress(Address address) {
        System.out.println("WangZhe---->" + address.getName());
    }
}
