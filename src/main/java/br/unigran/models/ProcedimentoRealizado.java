/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import lombok.Data;

/**
 *
 * @author andre
 */
@Entity
public @Data class ProcedimentoRealizado implements Serializable {

    @OneToMany(mappedBy = "procedimentoRealizado")
    private List<Arquivos> arquivoss;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Consulta consulta;
    
    @ManyToOne
    private Procedimento procedimento;
    @Lob
    private String observacao;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCadastro;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataRealizada;
    
    
    
    
  
}
