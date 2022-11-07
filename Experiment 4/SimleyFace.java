import java.applet.Applet;
import java.awt.Graphics;

public class SimleyFace extends Applet {

    private static final long serialVersionUID = 1L;
    
    public void paint(Graphics g) {
        g.drawOval(50, 50, 400, 400); 

        g.drawOval(110, 120, 90, 90);
        g.fillOval(130, 130, 20, 20);

        g.drawOval(290, 120, 90, 90);
        g.fillOval(310, 130, 20, 20);

        g.fillOval(240, 280, 40, 40);

        g.drawArc(160, 220, 200, 200, 225, 130);

    }

}