/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuto_jlabel_imageicon;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author lukha
 */
public class Tuto_JLabel_ImageIcon {

    public static ImageIcon getScaledIcon(String path, int width, int height ){
        ImageIcon srcIcon = new ImageIcon(path);
        Image srcImage = srcIcon.getImage();
        
        Image resizedImage = srcImage.getScaledInstance(width, height,
                Image.SCALE_SMOOTH);
        
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        return resizedIcon;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tuto JLabel ImageIcon");
        frame.setPreferredSize(new Dimension(800,600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon carotteImage = new ImageIcon("./img/carotte.png");
        ImageIcon resizedCarotteImage = getScaledIcon("./img/carotte.png", 
                300, 300);
 
        JImage label1 = new JImage("./img/carotte.png");
        label1.setBorder(BorderFactory.createTitledBorder("Label 1"));
        frame.add(label1);
        
        
        
        
        frame.pack();
        frame.setVisible(true);
    }
    
}
