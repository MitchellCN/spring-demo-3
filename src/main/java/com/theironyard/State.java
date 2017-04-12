package com.theironyard;

/**
 * Created by doug on 4/12/17.
 */
public class State {

    private Integer stateProvinceId;
    private String name;

    public State(Integer stateProvinceId, String name) {
        this.stateProvinceId = stateProvinceId;
        this.name = name;
    }

    public Integer getStateProvinceId() {
        return stateProvinceId;
    }

    public void setStateProvinceId(Integer stateProvinceId) {
        this.stateProvinceId = stateProvinceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
