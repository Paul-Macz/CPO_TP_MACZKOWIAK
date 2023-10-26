/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto_jframe_jlabel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author lukha
 */
public class Tuto_JFrame_JLabel {

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Tuto JFrame JLabel");
        frame.setPreferredSize(new Dimension(800,600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        
        JLabel label1 = new JLabel("Hello World");
        label1.setBorder(BorderFactory.createTitledBorder("label1"));
        frame.add(label1, BorderLayout.NORTH);
        
        JLabel label2 = new JLabel("Bye bye World");
        label2.setBorder(BorderFactory.createTitledBorder("label2"));
        frame.add(label2, BorderLayout.SOUTH);
        
        frame.pack();
        frame.setVisible(true);
        
        
    }
    
}
