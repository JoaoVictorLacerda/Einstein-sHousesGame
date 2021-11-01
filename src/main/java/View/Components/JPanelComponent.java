package View.Components;

import javax.swing.*;
import java.awt.*;

public class JPanelComponent  extends JPanel {

    private int roundDosCantos;

    public JPanelComponent( int arredondamento) {
        roundDosCantos = arredondamento;

        setOpaque(false);
    }
    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, roundDosCantos, roundDosCantos);
        super.paintComponent(g);
    }
    protected void paintBorder(Graphics g) {
        g.setColor(Color.decode("#000000"));
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, roundDosCantos, roundDosCantos);
    }
}
