/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto_mouselistener_mousemotionlistener;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author lukha
 */
public class Tuto_MouseListener_MouseMotionListener {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame = new JFrame("Tuto MouseListener");
        frame.setPreferredSize(new Dimension(800,600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        JLabel label1 = new JLabel("Bonjour !");
        label1.setName("LABEL 1");
        label1.setBorder(BorderFactory.createTitledBorder("label1"));
        frame.add(label1);
        
        JLabel label2 = new JLabel("Bonsoir !");
        label2.setName("LABEL 2");
        label2.setBorder(BorderFactory.createTitledBorder("label2"));
        frame.add(label2);
        
        JLabel label3 = new JLabel("Au revoir !");
        label3.setName("LABEL 3");
        label3.setBorder(BorderFactory.createTitledBorder("label3"));
        frame.add(label3);
        
        
        MouseListener monMouseListener = new MouseListener() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clic Event");
                System.out.println( "Vous avez cliqué en "+e.getPoint());
                if(e.getButton()==MouseEvent.BUTTON1){
                    System.out.println("Left !");
                }
                if (e.getButton()==MouseEvent.BUTTON3){
                    System.out.println("Right !");
                }
                Component c = frame.getContentPane().getComponentAt(e.getPoint());
                System.out.println("Vous avez cliqué sur "+c.getName());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Pressed Event");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Released Event");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Entered Event");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Exited Event");
            }
        };
        frame.addMouseListener(monMouseListener);
        
        
        
        frame.pack();
        frame.setVisible(true);
        
        
    }
    
}
