/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.controllers;

import com.ps.models.ClienteService;
import com.ps.views.InterfacePesquisa;
import com.ps.views.InterfacePrincipalPesquisa;
import javax.swing.JOptionPane;

/**
 *
 * @author rafallis
 */
public class ClienteController {
    
    public Boolean fazerLogin(int matricula, String senha) {
        //verificação de integridade
        ClienteService service = new ClienteService(matricula, senha);
        
        Boolean state = service.validaCliente();
        System.out.println(state);
        if(state != null && state) {
            //chamar tela principal
            
            JOptionPane.showMessageDialog(null, "LOGIN REALIZADO COM SUCESSO!");
            
            InterfacePrincipalPesquisa newInterface = new InterfacePrincipalPesquisa();
            
            return false;
        }
        return true;
    }
}
