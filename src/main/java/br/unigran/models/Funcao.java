/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

/**
 *
 * @author andre
 */
@Entity
public @Data class  Funcao implements Serializable {

    @OneToMany(mappedBy = "funcao")
    private List<Login> logins;

    /**
     * Dentista =1
     * Recepcionista=2
     * Gerente =3
     * Adminstrador =4
     */
    
    @Id
    private Long id;
    @Column(length = 50)
    private String nome;
    @Column(length = 50)
    private String descricao;    
    
}
