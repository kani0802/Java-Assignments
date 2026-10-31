import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleAWTFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("Java GUI");
        frame.add(new Label("Welcome to Java GUI"));

        frame.setSize(350, 200);
        frame.setLocationRelativeTo(null);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                frame.dispose();
            }
        });
        frame.setVisible(true);
    }
}
