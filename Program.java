import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program {

    static  Point pStart;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving object");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Move this object with RButton");


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel.setPreferredSize(new Dimension(500, 500));
        panel.setLayout(new GridBagLayout());

        label.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                pStart = e.getPoint();
            }
        });

        label.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (e.getButton() == 3) {
                    Point pEdt = SwingUtilities.convertPoint(label, e.getPoint(), panel);
                    label.setLocation(pEdt.x - pStart.x, pEdt.y - pStart.y);
                }
            }


        });

        panel.setFocusable(true);
        panel.add(label);
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);

    }
}
