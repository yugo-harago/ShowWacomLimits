
import javax.swing.*;
import java.awt.*;

public class App extends JWindow {
    public App() {
        super();
        this.setSize(500, 400);
        this.setLocation(50, 50);

        setBackground(new Color(0, 0, 0, 0)); // this is the critical line - that
        // fourth 0 represents alpha (or opacity)

        setAlwaysOnTop(true); // keeps it in the foreground so you don't click away
        // from it - note that clicks
        // on the transparent part DO pass through to the desktop, at least on Lion
        Image img = new Image();
        JLabel testLabel = new JLabel("Floating text hah");
        this.add(testLabel);

    }

    public static void main(String[] args) {
        App t = new App();
        t.setVisible(true);
    }
}