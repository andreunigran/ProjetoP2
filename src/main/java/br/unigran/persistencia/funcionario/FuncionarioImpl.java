/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistencia.funcionario;

import br.unigran.persistencia.padrao.Dao;
import br.unigran.models.Funcionario;
import java.util.List;

/**
 *
 * @author andre
 */
public class FuncionarioImpl implements FuncionarioDao{

    @Override
    public List listarbyNome(String nome) {
        return Dao.getInstace().getEm().createNativeQuery(
                 "select * from funcionario where nome like '% :? %'",Funcionario.class)
                .setParameter(1,nome).getResultList();
    }
}
