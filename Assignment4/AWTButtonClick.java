import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTButtonClick {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Button Click");
        Button button = new Button("Click Me");

        frame.setLayout(new FlowLayout());
        frame.add(button);
        button.addActionListener(event -> System.out.println("Button Clicked"));

        frame.setSize(300, 150);
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
