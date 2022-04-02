package com.codecool.exceptionscodecool.model;

import com.codecool.exceptionscodecool.exception.ComputerNotCompleteException;

public class Computer {
    private CPU cpu;
    private Ram ram;
    private PowerSupply powerSupply;

    public Computer(CPU cpu, Ram ram, PowerSupply powerSupply) {
        this.cpu = cpu;
        this.ram = ram;
        this.powerSupply = powerSupply;
    }

    public int getRemainingPower(){
        return cpu.getPower() + ram.getPower() + powerSupply.getPower();
    }

    public void checkComputerParts() throws ComputerNotCompleteException {
        if(cpu == null || ram == null || powerSupply == null){
            throw new ComputerNotCompleteException();
        }
    }

    public void checkPowerUsage(){

    }

    public void checkSomething(){
        if(cpu != null && cpu.getPower() < 0){ // && vs &
            System.out.println("a");
        }
    }
}
