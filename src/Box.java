import javax.swing.*;
import java.awt.*;

public class Box extends JFrame {
    // Attributes
    Bar b1;
    Bar b2;

    final int HEIGHT = 500;
    final int WIDTH = 800;

    // Constructors
    public Box(){

        // Normal JFrame stuff
        JFrame frame = new JFrame();
        frame.setTitle("B.A.M.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(WIDTH, HEIGHT));

        // 2 Panels in grid
        JPanel dual = new JPanel();
        LayoutManager layout = new GridLayout(2,1);
        dual.setLayout(layout);

        // Adds both health bars as panels
        b1 = new Bar(Color.RED);
        b2 = new Bar(Color.GREEN);
        dual.add(b1);
        dual.add(b2);

        frame.add(dual);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    // Methods
    public void run(){}

    // Get/Set

    // Overrides
}
