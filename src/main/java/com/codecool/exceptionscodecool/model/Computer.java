package com.codecool.exceptionscodecool.model;

public class Computer {
    private CPU cpu;
    private Ram ram;
    private PowerSupply powerSupply;

    public Computer(CPU cpu, Ram ram, PowerSupply powerSupply) {
        this.cpu = cpu;
        this.ram = ram;
        this.powerSupply = powerSupply;
    }

    public void checkComputerParts(){

    }

    public void checkPowerUsage(){

    }

    public void checkSomething(){
        if(cpu != null && cpu.getPower() < 0){ // && vs &
            System.out.println("a");
        }
    }
}
