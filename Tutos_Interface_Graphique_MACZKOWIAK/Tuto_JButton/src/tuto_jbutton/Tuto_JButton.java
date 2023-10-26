/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto_jbutton;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author lukha
 */
public class Tuto_JButton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Tuto JButton");
        frame.setPreferredSize(new Dimension(800,600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        JLabel label1 = new JLabel("Pas de clic pour le moment");
        frame.add(label1);
        
        
        ActionListener monListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton sourceButton = (JButton) e.getSource();
                sourceButton.setBackground(Color.red);
                label1.setText("Le bouton "+ e.getActionCommand()+" a été cliqué !");
            }
            
        };
        
        
        
        
        JButton button1 =new JButton("Clic me !");
        button1.setPreferredSize(new Dimension(200,100));
        button1.addActionListener(monListener);
        frame.add(button1);
        
        JButton button2 =new JButton("Clic me too!");
        button2.setPreferredSize(new Dimension(200,100));
        button2.addActionListener(monListener);
        frame.add(button2);
        
        
        
        
        
        frame.pack();
        frame.setVisible(true);
    }
    
}
