/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.persistencia.paciente;

import br.unigran.models.Paciente;
import br.unigran.persistencia.padrao.IntefaceDao;
import java.util.List;

/**
 *
 * @author andre
 */
public interface PacienteDao extends IntefaceDao {
    public List<Paciente> listar();
}
