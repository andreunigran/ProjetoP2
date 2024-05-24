/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.unigran.projetop2;

import br.unigran.view.app.TelaPrincipal;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import javax.swing.UIManager;

/**
 *
 * @author andre
 */
public class ProjetoP2 {
    
    public static void main(String[] args) {
        
        FlatLaf.registerCustomDefaultsSource("br.unigran.tema");
        FlatMacDarkLaf.setup();
        UIManager.put("Button.arc", 999);
        
        new TelaPrincipal().setVisible(true);
    }
}
