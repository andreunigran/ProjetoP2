/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unigran.dto;

import br.unigran.persistencia.padrao.DaoJDBC;
import java.sql.Connection;

/**
 *
 * @author andre
 */
public abstract class DTO {
        public String id;
        public abstract Object builder();
        
}
