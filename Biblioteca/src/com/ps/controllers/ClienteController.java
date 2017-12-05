/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.controllers;

import com.ps.models.Cliente;

/**
 *
 * @author rafallis
 */
public class ClienteController {
    
    private Cliente model;
    
    public ClienteController(Cliente model) {
        this.model = model;
    }
    
    public String getClienteNome() {
        return model.getNome();
    }
    
    public void setClienteNome(String nome) {
        model.setNome(nome);
    }
    
    public int getClienteMatricula() {
        return model.getMatricula();
    }
    
    public void setClienteMatricula(int mat) {
        model.setMatricula(mat);
    }
    
    public String getClienteTelefone() {
        return model.getTelefonePessoal();
    }
    
    public void setClienteTelefone(String telefone) {
        model.setTelefonePessoal(telefone);
    }
}
