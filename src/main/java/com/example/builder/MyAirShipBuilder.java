package com.example.builder;

/**
 * 具体构建者
 * 以Builder结尾的是构建者模式，
 *  eg：StringBuilder
 *      DomBuilder
 *      SaxBuilder
 */
public class MyAirShipBuilder implements AirShipBuilder {
    @Override
    public Engine builderEngine() {
        System.out.println("构建发动机");
        // 一般应该用工厂模式
        return new Engine("发动机");
    }
    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("轨道舱");
    }
    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建逃逸塔");
        return new EscapeTower("逃逸塔");
    }
}
