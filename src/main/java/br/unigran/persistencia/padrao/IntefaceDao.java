/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unigran.persistencia.padrao;

import java.util.List;

/**
 *
 * @author andre
 */
public interface IntefaceDao {

    public default void salvar(Object entidade) {
        Dao.getInstace().salvar(entidade);
    }

    public default void atualiza(Object entidade) {
        Dao.getInstace().atualiza(entidade);
    }

    public default void remove(Object entidade) {
        Dao.getInstace().remove(entidade);
    }

    public default void remove(Long id,Class clazz){
        Dao.getInstace ().remove(id,clazz);
    }
    public default List listar(Class clazz,String where){
        return Dao.getInstace ().listar(clazz, where);
    }
    public default List listar(Class clazz){
        return Dao.getInstace ().listar(clazz, "");
    }
       public default Object findById(Long id,Class clazz){
        return Dao.getInstace ().findbyID(id, clazz);
    }
}
