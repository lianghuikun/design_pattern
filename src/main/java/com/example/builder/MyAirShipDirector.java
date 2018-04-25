package com.example.builder;


// 组装者需要构建者组装
public class MyAirShipDirector implements AirShipDirector{
    // 装配者肯定需要调用构建者
    private AirShipBuilder airShipBuilder;
    public MyAirShipDirector(AirShipBuilder airShipBuilder) {
        this.airShipBuilder = airShipBuilder;
    }
    @Override
    public AirShip directAirShip() {
        // 构建子组件
        Engine engine = airShipBuilder.builderEngine();
        OrbitalModule o = airShipBuilder.builderOrbitalModule();
        EscapeTower et = airShipBuilder.builderEscapeTower();
        // 组装成飞船
        AirShip ship = new AirShip();
        ship.setEngine(engine);
        ship.setEscapeTower(et);
        ship.setOrbitalModule(o);
        return ship;
    }
}
