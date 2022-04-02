package com.codecool.exceptionscodecool;

import com.codecool.exceptionscodecool.model.CPU;
import com.codecool.exceptionscodecool.model.Computer;
import com.codecool.exceptionscodecool.model.PowerSupply;
import com.codecool.exceptionscodecool.model.Ram;

public class Simulation {

    public static void main(String[] args) {
        CPU cpu = new CPU(-100);
        Ram ram = new Ram(-50);
        PowerSupply powerSupply = new PowerSupply(125);

        Computer computer = new Computer(cpu, ram, powerSupply);

        computer.checkComputerParts();
        computer.checkPowerUsage();

        //& vs &&, | vs ||
        //computer.checkSomething();
    }

}
