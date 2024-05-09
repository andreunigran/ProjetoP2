/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;

/**
 *
 * @author andre
 */
@Entity
public @Data class Consulta implements Serializable {

    @OneToMany(mappedBy = "consulta")
    private List<Prontuarios> prontuarioss;

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 150)
    private String observacao;
    @ManyToOne
    private Arquivos anexos;
    @ManyToOne
    private Paciente paciente;
    @ManyToOne
    private Funcionario dentista;
    
    
  
}
