/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unigran.controllers;

import br.unigran.dto.DTO;
import br.unigran.persistencia.padrao.DaoJDBC;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author andre
 */
public interface Controller {

    public String[] getTitulosColunas();//colunas matriz

    public Object[] getDados(DTO dto);//array matriz

    public List getListaDados();//lista de dados 

    public void remover(DTO dto);

    public void salvar(DTO dto) throws Exception;

    public default Connection getConnJDBC() throws SQLException {
            
            return DaoJDBC.getInstace().getConnection();
        }
}
