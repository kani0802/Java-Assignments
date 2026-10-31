import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterExample {
    public static void main(String[] args) {
        Frame frame = new Frame("WindowAdapter Example");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                frame.dispose();
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}
