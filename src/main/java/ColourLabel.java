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
        g.fillRect((int)this.getBounds().getX()-50, (int)this.getBounds().getY()-50, (int)this.getBounds().getWidth(), (int)this.getBounds().getHeight());
        super.paint(g);
    }
    
}

