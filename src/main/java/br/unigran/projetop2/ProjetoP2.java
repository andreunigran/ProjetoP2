/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unigran.projetop2;

import br.unigran.models.Funcionario;
import br.unigran.persistencia.FuncionarioDao;

/**
 *
 * @author andre
 */
public class ProjetoP2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        FuncionarioDao dao = new FuncionarioDao();
        dao.listar(Funcionario.class);
    }
}
