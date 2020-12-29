package com.zs.ssm.domain;

import java.util.Map;

public class CarItem {
    private Map<Integer,Orders> map;

    public Map<Integer, Orders> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Orders> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "CarItem{" +
                "map=" + map +
                '}';
    }
}
