import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SwingButtonLabel {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Button and Label");
            JLabel label = new JLabel("Welcome");
            JButton button = new JButton("Click Me");

            button.addActionListener(event -> label.setText("Button Pressed"));

            JPanel panel = new JPanel();
            panel.add(label);
            panel.add(button);

            frame.add(panel);
            frame.setSize(350, 200);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
