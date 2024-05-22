/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unigran.projetop2;

import br.unigran.controllers.view.cadastros.Cadastro;
import br.unigran.controllers.view.cadastros.CadastroCliente;

/**
 *
 * @author andre
 */
public class ProjetoP2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
      new Cadastro(null, false,new CadastroCliente()).setVisible(true);
    }
}
