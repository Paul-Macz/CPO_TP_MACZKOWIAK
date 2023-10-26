/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuto_jlabel_imageicon;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/**
 *
 * @author lukha
 */
public class JImage extends JComponent{
    
    private ImageIcon img;

    public JImage(String image) {
        img = new ImageIcon(image);
    }

    @Override
    public void paintComponent(Graphics g){
        
        g.drawImage(img.getImage(), 0,0,this.getWidth(),this.getHeight(), this);
        
    }
    
    
}
