/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhssantiago.tdd.sistema.bancario.model;

/**
 * Interface contendo os métodos básicos que qualquer entidade 
 * (classe de negócio que será persistida no banco de dados) deve ter. 
 * 
 * @author jhons
 */
public interface Cadastro {
    /**
     * @return
     */
    long getId();

    /**
     * @param id
     */
    void setId(long id);
}
