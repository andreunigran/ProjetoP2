/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import lombok.Data;

/**
 *
 * @author andre
 */
@Entity
public @Data class  Agendamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Paciente paciente;
     
    @ManyToOne
    private Funcionario recepcionista;
    
    @ManyToOne
    private Funcionario dentista;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date hora;
    
}
