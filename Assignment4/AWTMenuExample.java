import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTMenuExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Menu Example");
        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        fileMenu.add(new MenuItem("New"));
        fileMenu.add(new MenuItem("Open"));

        Menu editMenu = new Menu("Edit");
        editMenu.add(new MenuItem("Copy"));
        editMenu.add(new MenuItem("Paste"));

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        frame.setMenuBar(menuBar);

        frame.setSize(400, 250);
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
