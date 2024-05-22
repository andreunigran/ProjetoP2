/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.dto;

import br.unigran.models.Funcionario;

/**
 *
 * @author andre
 */
public class FuncionarioDTO {
    public String nomeFuncionario;
    
    public Funcionario builder(){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nomeFuncionario);
        return funcionario;
    }
}
