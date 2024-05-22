/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistencia.funcionario;

import br.unigran.persistencia.padrao.IntefaceDao;
import java.util.List;

/**
 *
 * @author andre
 */
public interface FuncionarioDao extends IntefaceDao {
    public  List listarbyNome(String nome);
}
