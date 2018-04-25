package com.example.builder;

// 2、Builder接口
public interface AirShipBuilder {
    // 构建发送机
    Engine builderEngine();
    // 构建轨道舱
    OrbitalModule builderOrbitalModule();
    // 构建逃生仓
    EscapeTower builderEscapeTower();
}
