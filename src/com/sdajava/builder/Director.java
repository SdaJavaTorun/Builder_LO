package com.sdajava.builder;

/**
 * Created by lukas on 28.03.2017.
 */
public class Director {

    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Carset getCarset(){
        return builder.getCarset();
    }

    public void build(){
        builder.newCar();
        builder.buildEngine();
        builder.buildHood();
        builder.buildLacquer();
        builder.buildWheels();
        builder.buildSeats();
    }
}
