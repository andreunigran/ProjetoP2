/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import lombok.Data;

/**
 *
 * @author andre
 */
@Entity
public @Data class  Paciente implements Serializable {

    @OneToMany(mappedBy = "paciente")
    private List<Prontuario> prontuarios;

    @OneToMany(mappedBy = "paciente")
    private List<Agendamento> agendamentos;

    @OneToMany(mappedBy = "paciente")
    private List<Consulta> consultas;

    @OneToMany(mappedBy = "paciente")
    private List<Contato> contatos;

    @OneToMany(mappedBy = "responsavel" ,fetch = FetchType.LAZY)
    private List<Paciente> pacientes;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 150)
    private String nome;
    
    @Column(length = 14)
    private String cpf;
    
    @Column(name = "data_nascimento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataNascimento;
    
    @Column(length = 10, name = "numero_casa" )
    private String numeroCasa;
    
    @ManyToOne
    private Paciente responsavel;
    
    @ManyToOne
    private Endereco endereco;
    
}
