package org.example.ComputerBuilder;

public class ComputerBuilderDemo {

    public static void main(String[] args)
    {
        Computer firstComp = new Computer.ComputerBuilder("512", "8")
                .setBluetoothEnabled(true)
                .build();

        System.out.println(firstComp.toString());

        Computer secondComputer = new Computer.ComputerBuilder("1TB", "8")
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(secondComputer.toString());
    }
}
