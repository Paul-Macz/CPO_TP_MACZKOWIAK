/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_maczkowiak_version_graphique;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author lukha
 */
public class CelluleGraphique extends JLabel{
    CelluleLumineuse celluleAssocié;
    ImageIcon img_vide = new ImageIcon(getClass().getResource("/images/celluleVide.png"));
    ImageIcon img_jetonJaune = new ImageIcon(getClass().getResource("/images/jetonJaune.png"));
    ImageIcon img_jetonRouge = new ImageIcon(getClass().getResource("/images/jetonRouge.png"));
    ImageIcon img_trouNoir = new ImageIcon(getClass().getResource("/images/trouNoir.png"));
    int size=fenetreDeJeu.img_size;
    
    public CelluleGraphique (CelluleLumineuse uneCellule){
        celluleAssocié=uneCellule;
    }
    
   
    public static ImageIcon getScaledIcon(ImageIcon Img, int width, int height ){
        
        Image srcImage = Img.getImage();
        
        Image resizedImage = srcImage.getScaledInstance(width, height,
                Image.SCALE_SMOOTH);
        
        ImageIcon resizedIcon = new ImageIcon(resizedImage);
        return resizedIcon;
    }
    
    @Override
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        switch (celluleAssocié.getEtat()) {
            case 0 -> setIcon(getScaledIcon(img_jetonRouge,size, size));
            case 1 -> setIcon(getScaledIcon(img_jetonJaune, size,size));
            case 2 -> setIcon(getScaledIcon(img_trouNoir, size, size));
            default -> setIcon(getScaledIcon(img_vide, size,size));
        }
    }
}
