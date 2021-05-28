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

    @Test
    void testSetNumeroValido(){
        final Conta instance = new Conta();
        final String valido = "12345-6";
        instance.setNumero(valido);
        final String obtido = instance.getNumero();
        assertEquals(valido, obtido);
    }

}
