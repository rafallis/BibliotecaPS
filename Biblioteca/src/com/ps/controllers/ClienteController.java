/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.controllers;

import com.ps.models.ClienteService;

/**
 *
 * @author rafallis
 */
public class ClienteController {
    
    public void fazerLogin(int matricula, String senha) {
        //verificação de integridade
        
        ClienteService service = new ClienteService(matricula, senha);
        if(service.validaCliente()) {
            //chamar tela principal
        }
        
    }
}
