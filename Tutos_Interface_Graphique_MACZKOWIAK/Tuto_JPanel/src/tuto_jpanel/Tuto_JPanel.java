/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto_jpanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author lukha
 */
public class Tuto_JPanel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Tuto JPanel");
        frame.setPreferredSize(new Dimension(800,600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        JPanel centerPanel = new JPanel(new GridLayout(1,2));
        centerPanel.setBorder(BorderFactory.createTitledBorder("centerPanel"));
        frame.add(centerPanel, BorderLayout.CENTER);
        
        JLabel farmLabel = new JLabel("Farm");
        farmLabel.setBorder(BorderFactory.createTitledBorder("farmLabel"));
        centerPanel.add(farmLabel);
        
        JPanel animalPanel = new JPanel(new GridLayout(4,1));
        animalPanel.setBorder(BorderFactory.createTitledBorder("animalPanel"));
        centerPanel.add(animalPanel);
        
        JLabel animal1Label = new JLabel("Animal 1");
        animal1Label.setBorder(BorderFactory.createTitledBorder("animal1Label"));
        animalPanel.add(animal1Label);
        
        JLabel animal2Label = new JLabel("Animal 2");
        animal2Label.setBorder(BorderFactory.createTitledBorder("animal2Label"));
        animalPanel.add(animal2Label);
        
        JLabel animal3Label = new JLabel("Animal 3");
        animal3Label.setBorder(BorderFactory.createTitledBorder("animal3Label"));
        animalPanel.add(animal3Label);
        
        JLabel animal4Label = new JLabel("Animal 4");
        animal4Label.setBorder(BorderFactory.createTitledBorder("animal4Label"));
        animalPanel.add(animal4Label);
        
        
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1,3));
        bottomPanel.setBorder(BorderFactory.createTitledBorder("bottomPanel"));
        frame.add(bottomPanel,BorderLayout.SOUTH);
        
        JLabel label1 = new JLabel("First card");
        label1.setBorder(BorderFactory.createTitledBorder("label1"));
        bottomPanel.add(label1);
        
        JLabel label12 = new JLabel("Second card");
        label12.setBorder(BorderFactory.createTitledBorder("label1"));
        bottomPanel.add(label12);
        
        JLabel label3 = new JLabel("Third card");
        label3.setBorder(BorderFactory.createTitledBorder("label1"));
        bottomPanel.add(label3);
        
        frame.pack();
        frame.setVisible(true);
    }
    
}
