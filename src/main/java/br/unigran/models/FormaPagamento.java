/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

/**
 *
 * @author andre
 */
@Entity
public @Data class FormaPagamento implements Serializable {

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(scale = 4,precision = 2 )
    private Double valor;
    @Column(name = "tipo_pagamento")
    private TipoPagamento tipoPagamento;
  
    @ManyToOne
    private Consulta consulta;
}
