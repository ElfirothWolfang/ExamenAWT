/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import ejercicio1.*;
import java.awt.*;
import java.awt.event.*;

/**
 *Tarea 2 del examén de AWT de DEIN
 * @author Carlos Carbajo Rúa
 */
public class Contador extends Frame implements WindowListener{
    private final Panel m_pnMain;
    private final Label m_labHasPulsado;
    private final Button m_ButPulsa;
    private final String m_inicio = "No has pulsado el botón";
    private final String m_pulsado = "Has pulsado el botón ";
    private final String m_vez = " vez";
    private final String m_veces = " veces";
    private final String m_TextBoton = " Pulsa!";
    private int m_contador;
    private String s = "";
    private final Font m_Fuente;
    
    public Contador () {
        this.setSize(300,200);
        this.setTitle("Contador");
        this.setVisible(true);
        m_contador = 0;
        m_Fuente = new Font("Courier", Font.BOLD, 16);
        m_pnMain = new Panel (new GridLayout(2,1));        
        m_labHasPulsado = new Label(m_inicio);
        m_labHasPulsado.setFont(m_Fuente);
        m_ButPulsa = new Button(m_TextBoton);
        m_ButPulsa.setFont(m_Fuente);
        m_pnMain.add(m_labHasPulsado);
        m_pnMain.add(m_ButPulsa);
        this.add(m_pnMain);
        
        m_ButPulsa.addActionListener((ActionEvent e) -> {
            m_contador++;
            
            if (m_contador == 1){
            m_labHasPulsado.setText(m_pulsado + m_contador + m_vez);
            } else {
               m_labHasPulsado.setText(m_pulsado + m_contador + m_veces); 
            }
        });
        
        
        
        this.addWindowListener(this);
    }
    
    public static void main (String [] args) {
        var c = new Contador();
    }

    @Override
    public void windowOpened(WindowEvent e) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.  
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
