/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unigran.view.util;

import br.unigran.dto.DTO;
import javax.swing.JPanel;

/**
 *
 * @author andre
 */
public abstract class PainelInterface extends JPanel{
    public abstract DTO salvar();
    public abstract void preencheCampos(DTO dto);
}

