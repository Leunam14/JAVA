package org.example;

import org.example.ActividadCuentaBancaria.Cuenta;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.*;

public class CuentaBancariaTest {

    Cuenta cuen;

    @Before
    public void before(){
        cuen = new Cuenta("Juan", 500);

    }

    @Test
    public void probarIngresar(){

        double cantidad = 310.7;
        double total = cuen.getDinero();
        double esperado = cantidad + total;

        assertEquals(esperado, cuen.ingresar());

    }

    @Test
    public void probarRetirar(){

        double esperado = 250;

        assertEquals(esperado, cuen.retirar());

    }

}
