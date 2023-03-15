import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Bar extends JPanel implements MouseListener {
    // Attributes
    int h;
    int w;
    int hp;
    int dmg;
    Color c;

    // Constructors
    public Bar(Color c){

        // Colors, set!
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.c = c;

        // gives values to the numbers
        this.h = this.getHeight();
        this.w = this.getWidth();
        this.hp = 100;
        this.dmg = 10;

    }

    // Methods
    public void hurt(){ hp -= dmg;}
    public void heal(){ hp += (int)(dmg*1.5);}
    // Get/Set
    // Overrides


    @Override
    /*
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.paintComponent(g);
    }
     */
    public void mouseClicked(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1)
        { this.hurt(); }
        else { this.heal(); }
    }
    @Override
    public void mousePressed(MouseEvent e) {    }
    public void mouseReleased(MouseEvent e) {    }
    public void mouseEntered(MouseEvent e) {    }
    public void mouseExited(MouseEvent e) {    }
}
