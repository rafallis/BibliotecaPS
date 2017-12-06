/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ps.controllers;

import com.ps.models.ImpressoService;
import java.util.Date;

/**
 *
 * @author rafallis
 */
public class ImpressoController {
    
    public void adicionaImpresso(int id, String titulo, String editora, Date dataPublicacao, String autores, String tipo) {
        //verificações de consistência
        ImpressoService impresso = new ImpressoService(id, titulo, editora, dataPublicacao, autores, tipo);
        //trocar dados com o banco
    }
    
}
