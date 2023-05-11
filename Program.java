import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Program {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving object");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("test");



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        panel.setPreferredSize(new Dimension(500, 500));

        label.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                label.setBounds(e.getX(),e.getY(), label.getWidth(), label.getHeight());
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        panel.add(label);
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);

    }
}
