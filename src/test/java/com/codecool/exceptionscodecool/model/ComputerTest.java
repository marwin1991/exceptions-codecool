package com.codecool.exceptionscodecool.model;

import com.codecool.exceptionscodecool.exception.ComputerNotCompleteException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    public void givenValidComputer_whenGetRemainingPower_thenReturnValidResult(){
        //given:
        CPU cpu = new CPU(-100);
        Ram ram = new Ram( -25);
        PowerSupply powerSupply = new PowerSupply(150);
        Computer computer = new Computer(cpu, ram, powerSupply);

        //when:
        int result = computer.getRemainingPower();

        //then:
        assertEquals(25, result);
    }

    @Test
    public void givenValidComputer_whenGetRemainingPower_thenReturnZero(){
        //given:
        CPU cpu = new CPU(-125);
        Ram ram = new Ram( -25);
        PowerSupply powerSupply = new PowerSupply(150);
        Computer computer = new Computer(cpu, ram, powerSupply);

        //when:
        int result = computer.getRemainingPower();

        //then:
        assertEquals(0, result);
    }

    @Test
    public void givenNullCPU_whenGetRemainingPower_thenReturnZero(){
        //given:
        CPU cpu = null;
        Ram ram = new Ram( -25);
        PowerSupply powerSupply = new PowerSupply(150);
        Computer computer = new Computer(cpu, ram, powerSupply);

        //when:
        Assertions.assertThrows(ComputerNotCompleteException.class, computer::checkComputerParts);
    }



}