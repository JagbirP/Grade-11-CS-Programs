/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author purej1485
 */
public class ColourLabel extends JLabel {
    
    private Color colour = Color.LIGHT_GRAY;
    
    @Override
    public void paint(Graphics g){
        g.setColor(colour);
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
        super.paint(g);
    }
    
}
