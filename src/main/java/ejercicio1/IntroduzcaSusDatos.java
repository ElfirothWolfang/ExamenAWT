/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.awt.*;
import java.awt.event.*;

/**
 *Tarea 2 del examén de AWT de DEIN
 * @author Carlos Carbajo Rúa
 */
public class IntroduzcaSusDatos extends Frame implements WindowListener{
    private final Panel m_pnMain;
    private final Panel m_pnNombre;
    private final Panel m_pnApellidos;
    private final Panel m_pnEmail;
    private final Panel m_pnTelefono;
    private final Panel m_pnBotones;
    private final String [] M_ETIQUETAS = {
        "Nombre", "Apellidos", "Email", "Telefono"
    };
    
    private final String [] M_ETIQUETAS_BOTONES = {
        "Cancelar", "Aceptar"
    };

    private final Label [] m_etiquetas = new Label [4];
    private final TextField [] m_txtFTextos = new TextField [4];
    private final Button [] m_Botones = new Button [2];
    private final String [] M_ASTERISCOS = {
        "**************************************************", "RECIBIDO PEDIDO DE ",
        "CLIENTE: ", "TELEFONO: "  
    };
    private final Font m_Fuente;
    
    
    public IntroduzcaSusDatos () {
        this.setSize(800,500);
        this.setTitle("Introduzca sus datos");
        this.setVisible(true);
        m_Fuente = new Font("Courier", Font.BOLD, 16);
        m_pnMain = new Panel (new GridLayout(5, 1));
        m_pnNombre = new Panel(new FlowLayout());
        m_pnApellidos = new Panel(new FlowLayout());
        m_pnEmail = new Panel(new FlowLayout());
        m_pnTelefono = new Panel(new FlowLayout());
        m_pnBotones = new Panel(new FlowLayout());
        
        for (int k = 0; k < m_etiquetas.length; k++) {
            m_etiquetas[k] = new Label();
            m_etiquetas[k].setText(M_ETIQUETAS[k]);
            m_etiquetas[k].setFont(m_Fuente);
        }
        
        for (int k = 0; k < m_txtFTextos.length; k++) {
            m_txtFTextos[k] = new TextField();
            m_txtFTextos[k].setColumns(40);
            m_txtFTextos[k].setFont(m_Fuente);
        }
        
        for (int k = 0; k < m_Botones.length; k++) {
            m_Botones[k] = new Button(M_ETIQUETAS_BOTONES[k]);
            m_Botones[k].setFont(m_Fuente);
        }
        
        m_pnNombre.add(m_etiquetas[0]);
        m_pnNombre.add(m_txtFTextos[0]);
        m_pnApellidos.add(m_etiquetas[1]);
        m_pnApellidos.add(m_txtFTextos[1]);
        m_pnEmail.add(m_etiquetas[2]);
        m_pnEmail.add(m_txtFTextos[2]);
        m_pnTelefono.add(m_etiquetas[3]);
        m_pnTelefono.add(m_txtFTextos[3]);
        m_pnBotones.add(m_Botones[0]);
        m_pnBotones.add(m_Botones[1]);
        m_pnMain.add(m_pnNombre);
        m_pnMain.add(m_pnApellidos);
        m_pnMain.add(m_pnEmail);
        m_pnMain.add(m_pnTelefono);
        m_pnMain.add(m_pnBotones);
        this.add(m_pnMain);
        
        m_Botones[0].addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        m_Botones[1].addActionListener((ActionEvent e) -> {
            System.out.println(M_ASTERISCOS[0]);
            System.out.println(M_ASTERISCOS[1] + m_txtFTextos[2].getText());
            System.out.println(M_ASTERISCOS[2] + m_txtFTextos[1].getText()+ ", " + m_txtFTextos[0].getText());
            System.out.println(M_ASTERISCOS[3] + m_txtFTextos[3].getText());
            System.out.println(M_ASTERISCOS[0]);
            System.exit(0);
        });
        
        
        this.addWindowListener(this);
    }
    
    public static void main (String [] args) {
        var isd = new IntroduzcaSusDatos();
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
