package com.sdajava.builder;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        Builder tesla = new Tesla();

        System.out.println("Auto 1");

        director.setBuilder(tesla);
        director.build();

        Carset carset = director.getCarset();

        System.out.printf(carset.toString());

    }
}
