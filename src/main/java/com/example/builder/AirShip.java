package com.example.builder;

// 1、宇宙飞船
public class AirShip {
    // 轨道舱
    private OrbitalModule orbitalModule;
    // 发送机
    private Engine engine;
    // 逃逸塔
    private EscapeTower escapeTower;

    public AirShip() {
    }

    public AirShip(OrbitalModule orbitalModule, Engine engine, EscapeTower escapeTower) {
        this.orbitalModule = orbitalModule;
        this.engine = engine;
        this.escapeTower = escapeTower;
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}
// 轨道舱
class OrbitalModule {
    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
// 发送机
class Engine {
    private String name;

    public Engine(String name) {
        this.name = name;
    }
    // 发送机

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
// 逃逸塔
class EscapeTower{
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}