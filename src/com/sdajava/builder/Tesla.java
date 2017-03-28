package com.sdajava.builder;

/**
 * Created by lukas on 28.03.2017.
 */
public class Tesla extends Builder{

    @Override
    public void buildEngine() {
        carset.setEngine("Engine1");

    }

    @Override
    public void buildHood() {
        carset.setHood("hood2");
    }

    @Override
    public void buildLacquer() {
        carset.setLacquer("ladny");
    }

    @Override
    public void buildWheels() {
        carset.setWheels("ladne");
    }

    @Override
    public void buildSeats() {
        carset.setWheels("skora");
    }
}
