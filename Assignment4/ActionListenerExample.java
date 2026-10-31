import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class ActionListenerExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("ActionListener Example");
            JButton button = new JButton("Click Me");

            button.addActionListener(event ->
                JOptionPane.showMessageDialog(frame, "Hello User")
            );

            frame.add(button);
            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
