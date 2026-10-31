import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class KeyListenerExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("KeyListener Example");
            JLabel label = new JLabel("Press any key", SwingConstants.CENTER);

            frame.add(label);
            frame.setSize(400, 200);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent event) {
                    label.setText("Key Pressed: "
                        + KeyEvent.getKeyText(event.getKeyCode()));
                }
            });

            frame.setFocusable(true);
            frame.setVisible(true);
            frame.requestFocusInWindow();
            frame.addWindowFocusListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowGainedFocus(java.awt.event.WindowEvent event) {
                    frame.requestFocusInWindow();
                }
            });
        });
    }
}
