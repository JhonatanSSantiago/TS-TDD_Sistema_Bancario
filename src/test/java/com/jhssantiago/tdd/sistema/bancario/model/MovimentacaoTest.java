/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhssantiago.tdd.sistema.bancario.model;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de teste base para implementação dos testes unitários para a classe
 * {@link Movimentacao}. Os testes foram gerados pelo IDE apenas como modelo
 * (fiz apenas algumas melhorias de boas práticas como tirar visibilidade public
 * e definir variáveis como final).
 *
 * Assim, NENHUM DELES FUNCIONA E O CÓDIGO PRECISA SER ALTERADO de acordo com as
 * regras de negócio dos métodos da classe {@link Movimentacao}. Ao iniciar a
 * alteração de um teste aqui, a primeira coisa a fazer é remover a chamada de
 * fail(), que indica que o teste é apenas um protótipo.
 *
 * @author jhons
 */
public class MovimentacaoTest {

    /**
     * Verifica se o valor passado para o ID está sendo realmente armazenado.
     */
    @Test
    void testGetId() {
        final Movimentacao instance = new Movimentacao(new Conta());
        final long esperado = 1;
        instance.setId(esperado);
        final long obtido = instance.getId();
        assertEquals(esperado, obtido);
    }

    /**
     * R00 - Verifica se ocorre erro ao tentar inserir uma descrição nula.
     *
     * <p>
     * O nome dos testes para os requisitos indicados na classe
     * {@link Movimentacao} deve seguir este padrão de nome, onde o número do
     * requisito é incluído no nome do teste.
     * </p>
     */
    @Test
    void testR00SetDescricaoNula() {
        final Movimentacao instance = new Movimentacao(new Conta());
        assertThrows(NullPointerException.class, () -> instance.setDescricao(null));
    }

    /**
     * R00 - Verifica se ocorre erro ao tentar inserir uma descrição vazia.
     */
    @Test
    void testR00SetDescricaoVazia() {
        final Movimentacao instance = new Movimentacao(new Conta());
        assertThrows(IllegalArgumentException.class, () -> instance.setDescricao(""));
    }

    /**
     * R00 - Verifica se ocorre erro ao tentar inserir uma descrição somente com
     * espaços em branco.
     */
    @Test
    void testR00SetDescricaoBranco() {
        final Movimentacao instance = new Movimentacao(new Conta());
        final String espacosEmBranco = "           ";
        assertThrows(IllegalArgumentException.class, () -> instance.setDescricao(espacosEmBranco));
    }

    @Test
    void testR1TipoMovimentacaoCredito() {
        final Conta instance = new Conta();
        instance.depositoDinheiro(500);
        final List<Movimentacao> movimentacaoList = instance.getMovimentacoes();
        final Movimentacao mv = movimentacaoList.get(0);
        final char esperado = 'C';
        final char obtido = mv.getTipo();
        assertEquals(esperado, obtido);
    }

    @Test
    void testR1TipoMovimentacaoDebito() {
        final Conta instance = new Conta();
        instance.depositoDinheiro(600);
        instance.saque(500);
        final List<Movimentacao> movimentacaoList = instance.getMovimentacoes();
        final Movimentacao mv = movimentacaoList.get(1);
        final char esperado = 'D';
        final char obtido = mv.getTipo();
        assertEquals(esperado, obtido);
    }

    @Test
    void testR02ValorCreditoNegativo() {
        Conta instance = new Conta();
        assertThrows(IllegalArgumentException.class, () -> instance.depositoDinheiro(-500));
    }

    @Test
    void test03SaqueMaiorQueSaldo() {
        Conta instance = new Conta();
        instance.depositoDinheiro(500);
        assertThrows(IllegalArgumentException.class, () -> instance.saque(600));
    }

    @Test
    void test04DepositoConfirmado() {
        Conta instance = new Conta();
        instance.depositoDinheiro(500);
        final List<Movimentacao> movimentacaoList = instance.getMovimentacoes();
        final Movimentacao mv = movimentacaoList.get(0);
        final boolean esperado = true;
        final boolean obtido = mv.isConfirmada();
        assertEquals(esperado, obtido);
    }
    
    @Test
    void test04SaqueConfirmado() {
        Conta instance = new Conta();
        instance.depositoDinheiro(500);
        instance.depositoDinheiro(400);
        final List<Movimentacao> movimentacaoList = instance.getMovimentacoes();
        final Movimentacao mv = movimentacaoList.get(1);
        final boolean esperado = true;
        final boolean obtido = mv.isConfirmada();
        assertEquals(esperado, obtido);
    }

}
