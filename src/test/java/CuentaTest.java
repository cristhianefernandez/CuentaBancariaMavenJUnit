/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.cuentabancariamavenjunit.Cuenta;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author crist
 */
public class CuentaTest {
    
    public CuentaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void probarDepositoDeValorMayorACero() 
    {
        //Arrange (Preparación)
        Cuenta cuenta = new Cuenta("22333323232", "Juan Carlos Gutierrez");
        
        //Act
        cuenta.depositarDinero(450);
        
        //Assert
        assertEquals(450, cuenta.getSaldo());
        
    }
    
    
    @Test
    public void probarDepositoDeValorIgualACero() 
    {
        //Arrange (Preparación)
        Cuenta cuenta = new Cuenta("22333323232", "Juan Carlos Gutierrez");
        
        //Act
        cuenta.depositarDinero(0);
        
        //Assert
        assertEquals(0, cuenta.getSaldo());
    }
    
    @Test
    public void probarDepositoDeValorNegativo() 
    {
        //Arrange (Preparación)
        Cuenta cuenta = new Cuenta("22333323232", "Juan Carlos Gutierrez");
        
        //Act
        cuenta.depositarDinero(-300);
        
        //Assert
        assertEquals(0, cuenta.getSaldo());
    }
    
    @Test
    public void probarVerificacionSaldoenCero() 
    {
        //Arrange (Preparación)
        Cuenta cuenta = new Cuenta("22333323232", "Juan Carlos Gutierrez");
        
        //Act
        //cuenta.depositarDinero(-300);
        //boolean esSaldoCero = cuenta.saldoEstaEnCero();
        
        //Assert
        assertTrue(cuenta.saldoEstaEnCero());
    }
}
