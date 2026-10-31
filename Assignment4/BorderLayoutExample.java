import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BorderLayoutExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("BorderLayout Example");
            frame.setLayout(new BorderLayout());

            frame.add(new JButton("North"), BorderLayout.NORTH);
            frame.add(new JButton("South"), BorderLayout.SOUTH);
            frame.add(new JButton("East"), BorderLayout.EAST);
            frame.add(new JButton("West"), BorderLayout.WEST);
            frame.add(new JButton("Center"), BorderLayout.CENTER);

            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
