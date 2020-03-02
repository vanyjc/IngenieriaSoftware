/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.test;

import ico.fes.is.CamisasShop;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vannie
 */
public class CamisasTest {
    
    private CamisasShop objeto;
    
    public CamisasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        objeto = new CamisasShop();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
        
    @Test
    public void probarCalcularPorCamisa(){
        int esperado= 380;
        assertEquals(esperado,objeto.calcularPorCamisa(190, 2));
    }
    
    @Test
    public void probarCalcularSinDesc(){
        objeto.setCantidad1(2);
        objeto.setCantidad2(1);
        objeto.setCantidad3(1);
        int esperado=920;
        assertEquals(esperado, objeto.calcularSinDesc(),0);
    }
    
    @Test 
    public void probarCalcularConDesc(){
        objeto.setCantidad1(1);
        objeto.setCantidad2(1);
        objeto.setCantidad3(1);
        double esperado = 693.5;
        assertEquals(esperado,objeto.calcularConDesc(),0);        
    }
    
}
