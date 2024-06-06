/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.dto;

import br.unigran.models.Paciente;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author andre
 */
public class PacienteDTO extends DTO{
    public String nomePaciente;
    public Date data;
    
    public Paciente builder(){
        Paciente paciente = new Paciente();
        paciente.setNome(nomePaciente);
        paciente.setId(id!=null?Long.valueOf(id):0l);
        paciente.setDataNascimento(data);
        return paciente;
    }

    public List getListaDados(List<Paciente> dados) {
        List dadosDTO = new LinkedList();
        for (Paciente dado : dados) {
            dadosDTO.add(converte(dado));
        }
        return dadosDTO;
    }

    private Object converte(Paciente f) {
        
        PacienteDTO dto= new PacienteDTO();
        dto.nomePaciente=f.getNome();
        dto.id=f.getId().toString();
        dto.data=f.getDataNascimento();
        return dto;
    }
    
}
