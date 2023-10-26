/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto_jlayeredpane;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author lukha
 */
public class Tuto_JLayeredPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Tuto JLayeredPane");
        frame.setPreferredSize(new Dimension(800,600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLayeredPane pane = new JLayeredPane();
        frame.add(pane);
        
        
        
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setBorder(BorderFactory.createTitledBorder("backgroundPanel"));
        backgroundPanel.setBackground(Color.YELLOW);
        backgroundPanel.setBounds(0, 0, 800, 600);
        pane.add(backgroundPanel);
        
        JPanel panelOfMessage = new JPanel();
        panelOfMessage.setBorder(BorderFactory.createTitledBorder("paneOfMessage"));
        panelOfMessage.setBounds(100, 100, 600, 400);
        panelOfMessage.setOpaque(false);
        pane.add(panelOfMessage, new Integer(1));

        JLabel label1 = new JLabel("Un message très très long et qui risque de dépasser");
        label1.setBorder(BorderFactory.createTitledBorder("label1"));
        panelOfMessage.add(label1);
        
        JLabel label2 = new JLabel("Un deuxième messager");
        label2.setBorder(BorderFactory.createTitledBorder("label3"));
        panelOfMessage.add(label2);
        
        JLabel label3 = new JLabel("Un troisième message");
        label3.setBorder(BorderFactory.createTitledBorder("label3"));
        panelOfMessage.add(label3);
        
        
        frame.pack();
        frame.setVisible(true);
        
        
    }
    
}
