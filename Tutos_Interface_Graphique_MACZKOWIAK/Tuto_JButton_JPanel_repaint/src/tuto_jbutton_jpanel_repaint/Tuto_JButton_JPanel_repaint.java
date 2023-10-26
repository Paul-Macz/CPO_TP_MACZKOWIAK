/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto_jbutton_jpanel_repaint;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author lukha
 */
public class Tuto_JButton_JPanel_repaint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(800,600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1,2));
        
        JPanel leftPanel =new JPanel();
        leftPanel.setBorder(BorderFactory.createTitledBorder("LEFT"));
        frame.add(leftPanel);
        
        JPanel rightPanel =new JPanel();
        rightPanel.setBorder(BorderFactory.createTitledBorder("RIGHT"));
        frame.add(rightPanel);
        
        JButton button = new JButton("Clic me !");
        leftPanel.add(button);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (leftPanel.getComponentCount()>0){
                    leftPanel.remove(button);
                    rightPanel.add(button);
                    button.setPreferredSize(new Dimension(300,100));
                } else {
                    rightPanel.remove(button);
                    leftPanel.add(button);
                    button.setPreferredSize(null);
                }
                frame.revalidate();
                
                frame.repaint();
            }
        });
        
        
        frame.pack();
        frame.setVisible(true);
    }
    
}
