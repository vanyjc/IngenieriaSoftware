/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.test;

import ico.fes.is.TennisGame;
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
public class TennisTest {
    
    private TennisGame juego;
    
    public TennisTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        juego = new TennisGame("Vania","Andres");
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testJugadorUnoGana(){
	createScore(4, 0);
	String score = juego.getScore();
	assertEquals("Vania gana", score);
   }
    
    @Test
    public void jugadorUnoGanaUnPunto(){
        juego.playerOneScores();
        String score = juego.getScore();
        assertEquals("Quince,Love", score);
    }
    
    @Test
    public void testAmbosQuince(){
	juego.playerOneScores();
	juego.playerTwoScores();
        String score = juego.getScore();
	assertEquals("Quince todos", score);
    }

    @Test
    public void testJugadoresDeuce() {
	createScore(4, 4);
	String score = juego.getScore();
	assertEquals("Deuce", score);		
    }

    @Test
    public void testJugadorUnoVentaja(){
	createScore(5, 4);
        String score = juego.getScore();
	assertEquals("Ventaja Vania", score);
    }
	
    @Test
    public void testJugadorDosGanaDespuesDeVentaja() {
        createScore(6, 8);
	String score = juego.getScore();
	assertEquals("Andres gana", score);
    }
	
    private void createScore(int playerOneBalls, int playerTwoBalls ) {
	for (int i = 0; i < playerOneBalls; i++) {
		juego.playerOneScores();
	}
	for (int i = 0; i < playerTwoBalls; i++) {
		juego.playerTwoScores();
        }
    }
}    
        
