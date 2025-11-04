package es.fpsumma.dam1.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberUtilsTest {
    @Test
    public void sumaOK(){
        int resultado = NumberUtils.suma(2, 03);
        assertEquals(5, resultado);
    }
   
    @test 
    public void restaOK(){
        int resultado = NumberUtils.subtract(10, 5);
        assertEquals(2, resultado);
    }

    @test

    public void multiplyOK(){
        int resultado = NumberUtils.multiply(3, 3);
        assertEquals(9, resultado);
    }

    @test 

    public void isEvenOK(){
        boolean resultado = NumberUtils.isEven(10);
        assertEquals(true,resultado);
    }

    @test

    public void 
}