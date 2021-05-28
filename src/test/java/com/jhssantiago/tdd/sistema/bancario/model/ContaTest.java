/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhssantiago.tdd.sistema.bancario.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jhons
 */
public class ContaTest {
    
    @Test
    void testAddMovimentacao() {
        //TODO: Você precisa implementar este teste
    }

    /* Testes do R1 */

    @Test
    void testSetNumeroValido(){
        final Conta instance = new Conta();
        final String valido = "12345-6";
        instance.setNumero(valido);
        final String obtido = instance.getNumero();
        assertEquals(valido, obtido);
    } 

    @Test
    void testSetNumeroInvalidoNaoArmazena(){
        final Conta instance = new Conta();
        final String invalido = "123";
        assertThrows(IllegalArgumentException.class, () -> instance.setNumero(invalido));
        final String obtido = instance.getNumero();
        assertNotEquals(invalido, obtido);
    }

    @Test //Numero Nulo
    void testSetNumeroNull(){
        final Conta instance = new Conta();       
        assertThrows(NullPointerException.class, () -> instance.setNumero(null));
    }

    /* Testes do R2 */

    @Test 
    void testInstanciaPadraoPoupanca(){
        final Conta instance = new Conta();
        assertFalse(instance.isPoupanca());
    }

    /* Testes do R3 */

    @Test 
    void testSetLimiteContaEspecial(){
        final Conta instance = new Conta();
        instance.setEspecial(true);
        final double esperado = 1000;
        instance.setLimite(esperado);
        final double obtido = instance.getLimite();
        assertEquals(esperado, obtido);
    }

    @Test
    void testSetLimiteContaNaoEspecial(){
        final Conta instance = new Conta();
        final double limite = 1000;
        assertThrows(IllegalStateException.class, () -> instance.setLimite(limite));
        final double obtido = instance.getLimite();
        assertNotEquals(limite, obtido);
    }

    /* Testes do R4 */

    @Test
    void testHistoricoNotNull(){
        final Conta instance = new Conta();
        assertNotNull(instance.getMovimentacoes());
    }
}
